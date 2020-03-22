package net.ricecode.similarity;

public class ExtractedSuperclass implements CompareInterface {
    /**
     * Compares two similarity scores.
     * @param x The first score to be compared.
     * @param y The second score to be compared.
     * @return a negative integer, zero, or a positive integer as the first score is greater than,
     * equal to, or less than the second score.
     */
    @Override
    public int compare(SimilarityScore x, SimilarityScore y) {
        double first = x.getScore();
        double second = y.getScore();
        if (first == second) {
            return 0;
        }
        if (first < second) {
            return 1;
        }
        return -1;
    }
}
