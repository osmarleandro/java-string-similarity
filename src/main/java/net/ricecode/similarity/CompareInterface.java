package net.ricecode.similarity;

import net.ricecode.SimilarityScore;

public interface CompareInterface {

	/**
	 * Compares two similarity scores.
	 * @param x The first score to be compared.
	 * @param y The second score to be compared.
	 * @return a negative integer, zero, or a positive integer as the first score is greater than,
	 * equal to, or less than the second score. 
	 */
	int compare(SimilarityScore x, SimilarityScore y);

}