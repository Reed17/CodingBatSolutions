package ua.artcode.solutions.map_1;

import java.util.Map;

/**
 * author Vladyslav Dziubko
 */
public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") && map.get("ice cream") != null) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach") && map.get("spinach") != null) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}
