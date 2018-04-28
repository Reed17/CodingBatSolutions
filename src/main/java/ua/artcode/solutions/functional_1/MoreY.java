package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class MoreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }
}
