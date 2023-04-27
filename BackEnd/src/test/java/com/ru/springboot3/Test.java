package com.ru.springboot3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        System.out.println(Objects.equals(map.get(1), map.get(2)));
    }
}
