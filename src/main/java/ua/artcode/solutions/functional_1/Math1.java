package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
    }
}
