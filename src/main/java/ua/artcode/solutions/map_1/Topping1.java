package ua.artcode.solutions.map_1;

import java.util.Map;

/**
 * author Vladyslav Dziubko
 */
public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("bread", "butter");
            map.put("ice cream", "cherry");
        } else {
            map.put("bread", "butter");
        }
        return map;
    }
}
