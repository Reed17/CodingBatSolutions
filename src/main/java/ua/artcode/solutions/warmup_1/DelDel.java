package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class DelDel {
    public String delDel(String str) {
        return str.length() >= 4 && str.substring(1, 4).equals("del") ?
                str.substring(0, 1) + str.substring(4) : str;
    }
}
