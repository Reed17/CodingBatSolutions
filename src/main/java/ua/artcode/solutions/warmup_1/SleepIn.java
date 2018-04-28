package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
