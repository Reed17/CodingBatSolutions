package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }
}
