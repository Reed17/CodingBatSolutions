package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class EveryNth {
    public String everyNth(String str, int n) {
        String s = "";
        int index = 0;
        while (index < str.length()) {
            s += str.charAt(index);
            index += n;
        }
        return s;
    }
}
