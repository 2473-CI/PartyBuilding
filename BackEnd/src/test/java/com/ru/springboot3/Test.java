package com.ru.springboot3;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "yr");
        map.put(1, "r");
        String s = map.get(1);
        System.out.println(s);
    }
}
