package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class FrontBack {
    public String frontBack(String str) {
        return str.length() > 1 ?
                str.substring(str.length() - 1) + str.substring(1, str.length() - 1)
                        + str.substring(0, 1) : str;
    }
}
