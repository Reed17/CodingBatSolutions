package ua.artcode.solutions.functional_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
    }
}
