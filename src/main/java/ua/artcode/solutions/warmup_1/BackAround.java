package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class BackAround {
    public String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }
}
