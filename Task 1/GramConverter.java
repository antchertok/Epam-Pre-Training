package first;

public class GramConverter {
    private static final int GRAMS_PER_KILO = 1000;
    private static final int GRAMS_PER_TONS = 1_000_000;

    public static double getTons(long grams) {
        return grams / GRAMS_PER_TONS;
    }

    public static double getKilo(long grams) {
        return grams / GRAMS_PER_KILO;
    }
}
