package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class Max1020 {
    public int max1020(int a, int b) {
        boolean isA = (a >= 10 && a <= 20);
        boolean isB = (b >= 10 && b <= 20);
        return isA && !isB ? a
                : isB && !isA ? b
                : isA && isB && (a > b) ? a
                : isA && isB && (a < b) ? b : 0;
    }
}
