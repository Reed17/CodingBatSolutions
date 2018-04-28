package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class LastDigit {
    public boolean lastDigit(int a, int b) {
        return (a == b % 10) || (b == a % 10);
    }
}
