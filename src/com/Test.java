package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/5.
 */
public class Test {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("result",11);
        System.out.println(map.get("result"));
    }
}
