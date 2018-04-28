package ua.artcode.solutions.functional_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class NoLong {
    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }
}
