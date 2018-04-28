package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        return (a > 0 && b < 0 && !negative) || (a < 0 && b > 0 && !negative)
                || (a < 0 && b < 0 && negative);
    }
}
