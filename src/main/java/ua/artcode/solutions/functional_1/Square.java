package ua.artcode.solutions.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author Vladyslav Dziubko
 */
public class Square {
    public List<Integer> square(List<Integer> nums) {
        //return nums.stream().map(n -> (int)Math.pow(n, 2)).collect(Collectors.toList());
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }
}
