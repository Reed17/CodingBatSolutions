package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class StringE {
    public boolean stringE(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("e")) {
                res++;
            }
        }
        return res >= 1 && res <= 3;
    }
}
