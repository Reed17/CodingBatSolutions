package ua.artcode.solutions.map_1;

import java.util.Map;

/**
 * author Vladyslav Dziubko
 */
public class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato") && map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad") && map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}
