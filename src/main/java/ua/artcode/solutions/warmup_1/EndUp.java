package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class EndUp {
    public String endUp(String str) {
        String res = "";
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        res = str.substring(0, str.length() - 3)
                + str.substring(str.length() - 3).toUpperCase();
        return res;
    }
}
