package ua.artcode.solutions.functionsl_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class NoZ {
    public List<String> noZ(List<String> strings) {
        /*strings.removeIf(s -> s.contains("z"));
        return strings;*/
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }
}
