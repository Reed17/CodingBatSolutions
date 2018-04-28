package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class MissingChar {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
