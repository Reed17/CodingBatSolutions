package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class MixStart {
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }
}
