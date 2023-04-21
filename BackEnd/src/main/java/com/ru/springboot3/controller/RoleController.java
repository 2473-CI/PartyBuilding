package com.ru.springboot3.controller;

import com.ru.springboot3.model.Result;
import com.ru.springboot3.model.Role;
import com.ru.springboot3.service.Imp.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/role")
@RestController
public class RoleController {
    @Autowired
    private RoleServiceImp roleServiceImp;

    @GetMapping("/getList")
    public Result<List<Role>> getList(){
        return Result.success(roleServiceImp.selectAll());
    }
}
