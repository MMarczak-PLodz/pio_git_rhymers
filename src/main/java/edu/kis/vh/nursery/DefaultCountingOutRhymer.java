package edu.kis.vh.nursery;

/**
 * Domyślna wersja rhymera bez udziwnień
 */
public class DefaultCountingOutRhymer {


    public static final int ERROR = -1;
    public static final int SIZE = 12;
    private int[] numbers = new int[SIZE];

    private int total = ERROR;

    /**
     * dodaje element do rhymera
     * @param in - element do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * sprawdza czy rhymer zawiera jakikolwiek element
     * @return wartość prawda/fałsz
     */
    public boolean callCheck() {
        return total == ERROR;
    }

    /**
     * sprawdza czy struktura jest pusta
     * @return wartość prawda/fałsz
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Podgląda następną liczbę z rhymera bez usuwania jej
     * @return kolejna liczba
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    /**
     * Zwraca kolejną liczbę z rhymera
     * @return kolejna liczba
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    /**
     * zwraca ilość elementów w rhymerze
     * @return ilość elementów
     */
    public int getTotal() {
        return total;
    }
}
