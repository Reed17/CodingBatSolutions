package ua.artcode.solutions.map_1;

import java.util.Map;

/**
 * author Vladyslav Dziubko
 */
public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
