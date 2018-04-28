package ua.artcode.solutions.functionsl_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class No34 {
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 3 || s.length() > 4)
                .collect(Collectors.toList());
    }
}
