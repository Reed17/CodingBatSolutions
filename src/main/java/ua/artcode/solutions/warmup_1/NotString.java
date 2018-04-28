package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class NotString {
    public String notString(String str) {
        return str.length() >= 3 && str.substring(0, 3).equals("not") ? str : "not " + str;
    }
}
