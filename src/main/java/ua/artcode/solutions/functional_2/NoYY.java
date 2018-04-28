package ua.artcode.solutions.functional_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class NoYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("yy") && !s.endsWith("y"))
                .map(s -> s + "y")
                .collect(Collectors.toList());
    }
}
