package com.ru.springboot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

@CrossOrigin(origins = "*")
@RequestMapping("/file")
@RestController
public class FileController {
    @Autowired
    private Environment env;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // 获取文件存储路径
            String uploadDir = env.getProperty("file.upload-dir");

            System.out.println("File Name: " + file.getOriginalFilename());
            System.out.println("Content Type: " + file.getContentType());
            System.out.println("File Size: " + file.getSize());
            String fileName =   Instant.now().toEpochMilli() +  file.getOriginalFilename() ;
            Path path = Paths.get(uploadDir + "/" + fileName);
            Files.write(path, file.getBytes());
            return ResponseEntity.ok(
                    String.format("""
                    {
                        "errno": 0, 
                        "data": {
                            "url": "%s", 
                            "alt": "%s", 
                            "href": "%s"                                                                                                 
                        }
                    }
                    """, "/file/download?filename="+fileName, fileName, "http://localhost:8080" + "/file/download?filename="+fileName)
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("""
                    {
                        "errno": 1, 
                        "message": "上传失败！"
                    }
                    """);
        }
    }

    @GetMapping("/download")
    public ResponseEntity<Resource> loadFileAsResource(@RequestParam("filename") String filename) throws FileNotFoundException {
        try {
            // 获取文件存储路径
            String uploadDir = env.getProperty("file.upload-dir");

            Path filePath = Paths.get(uploadDir).resolve(filename).normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists()) {
                return ResponseEntity.ok()
                        .contentType(MediaType.parseMediaType("image/jpeg"))
                        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            } else {
                throw new FileNotFoundException("File not found " + filename);
            }
        } catch (MalformedURLException | FileNotFoundException ex) {
            throw new FileNotFoundException("File not found " + filename);
        }
    }

    @GetMapping("/word/download")
    public ResponseEntity<Resource> loadWordFileAsResource(@RequestParam("filename") String filename) throws FileNotFoundException {
        try {
            // 获取文件存储路径
            String uploadDir = env.getProperty("file.upload-dir");

            Path filePath = Paths.get(uploadDir).resolve(filename).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            System.out.println(filePath.toUri());

            if (resource.exists()) {
                return ResponseEntity.ok()
                        .contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))
                        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"; filename*=utf-8''"+resource.getFilename())
                        .contentLength(resource.contentLength())
                        .body(resource);
            } else {
                throw new FileNotFoundException("File not found " + filename);
            }
        } catch (MalformedURLException | FileNotFoundException ex) {
            throw new FileNotFoundException("File not found " + filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @GetMapping("/sheet/download")
    public ResponseEntity<Resource> loadSheetFileAsResource(@RequestParam("filename") String filename) throws FileNotFoundException {
        try {
            // 获取文件存储路径
            String uploadDir = env.getProperty("file.upload-dir");

            Path filePath = Paths.get(uploadDir).resolve(filename).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            System.out.println(filePath.toUri());

            if (resource.exists()) {
                return ResponseEntity.ok()
                        .contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"; filename*=utf-8''"+resource.getFilename())
                        .contentLength(resource.contentLength())
                        .body(resource);
            } else {
                throw new FileNotFoundException("File not found " + filename);
            }
        } catch (MalformedURLException | FileNotFoundException ex) {
            throw new FileNotFoundException("File not found " + filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
