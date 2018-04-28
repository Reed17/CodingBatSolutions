package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        boolean isA = (a > b && a > c);
        boolean isB = (b > c && b > a);
        return isA ? a : isB ? b : c;
    }
}
