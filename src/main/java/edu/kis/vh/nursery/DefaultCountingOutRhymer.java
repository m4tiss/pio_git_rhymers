package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int NO_ELEMENTS = -1;
    private final int[] numbers = new int[MAX_SIZE];
    public static final int DEFAULT_RETURN_VALUE = -1;
    public static final int LAST_INDEX = MAX_SIZE - 1;
    public int total = NO_ELEMENTS;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NO_ELEMENTS;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
