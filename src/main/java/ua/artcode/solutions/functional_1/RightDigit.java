package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }
}
