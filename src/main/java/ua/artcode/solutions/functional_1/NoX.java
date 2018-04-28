package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class NoX {
    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", ""))
                .collect(Collectors.toList());
    }
}
