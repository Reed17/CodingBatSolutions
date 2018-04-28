package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        return ((a >= 13 && a <= 19) && (b < 13 || b > 19))
                || ((a < 13 || a > 19) && (b >= 13 && b <= 19));
    }

/*
public boolean loneTeen(int a, int b) {
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  return (aTeen && !bTeen) || (!aTeen && bTeen);
}
*/
}
