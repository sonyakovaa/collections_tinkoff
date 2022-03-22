package ru.tinkoff.fintech;

import java.util.Map;
import java.util.HashMap;

public class MapHandler {
    public static Map<String, String> handleMap(Map<String, String> map){
        Map<String, String> numbers_user = new HashMap<>();

        for (Map.Entry<String, String> item : map.entrySet()) {
            if (!numbers_user.containsKey(item.getValue())) {
                numbers_user.put(item.getValue(), item.getKey());
            }
            else {
                String res = numbers_user.get(item.getValue()) + ',' + item.getKey();
                numbers_user.put(item.getValue(), res);
            }
        }

        return numbers_user;
    }
}
