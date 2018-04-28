package ua.artcode.solutions.warmup_1;

/**
 * author Vladyslav Dziubko
 */
public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
}
