package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int ZERO_REJECTED = 0;
    private int totalRejected = ZERO_REJECTED;

    /**
     *
     * @return total number of rejected Rhymers
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     *
     * @param in line 23 increments total number of rejected Rhymers
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     *
     * @return total number of rejected Rhymers
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}
