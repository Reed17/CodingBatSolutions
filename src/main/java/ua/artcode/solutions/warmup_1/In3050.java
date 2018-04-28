package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class In3050 {
    public boolean in3050(int a, int b) {
        boolean inRange = ((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
                || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
        return inRange;
    }
}
