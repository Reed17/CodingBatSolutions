package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class StartOZ {
    public String startOz(String str) {
        String res = "";
        if (str.length() >= 1) {
            if (str.charAt(0) == 'o') {
                res = "o";
            }
        }
        if (str.length() >= 2) {
            if (str.charAt(1) == 'z') {
                res = "z";
            }
            if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
                res = "oz";
            }
        }
        return res;
    }
}
