package ua.artcode.solutions.functional_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }
}
