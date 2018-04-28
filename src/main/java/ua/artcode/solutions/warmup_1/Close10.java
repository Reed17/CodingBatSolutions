package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class Close10 {
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff > bDiff) {
            return b;
        } else if (aDiff < bDiff) {
            return a;
        } else {
            return 0;
        }
    }
}
