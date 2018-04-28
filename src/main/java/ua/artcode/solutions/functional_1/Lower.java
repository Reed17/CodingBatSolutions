package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class Lower {
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}
