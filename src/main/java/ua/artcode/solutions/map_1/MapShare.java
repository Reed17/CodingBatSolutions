package ua.artcode.solutions.map_1;

import java.util.Map;

/**
 * author Vladyslav Dziubko
 */
public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }
        if (map.containsKey("a") && map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        return map;
    }
}
