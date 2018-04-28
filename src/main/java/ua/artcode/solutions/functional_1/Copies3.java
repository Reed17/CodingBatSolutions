package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class Copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }
}
