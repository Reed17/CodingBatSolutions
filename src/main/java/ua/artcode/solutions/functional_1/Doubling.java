package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        //nums.replaceAll(n -> n * 2);
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
