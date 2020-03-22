package net.ricecode.similarity;

import org.junit.Test;
import static org.junit.Assert.*;

public class LevenshteinDistanceStrategyTest {

    @Test (expected = NullPointerException.class)
    public void testNullThrows() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        lds.score(null, "kEvIn");
    }

    @Test
    public void emptyStringTest() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("", "");
        assertEquals(1.0, response, 0.0);
    }

    @Test
    public void testExactMatchDifferentCase() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("KeViN", "kevin");
        assertEquals(1.0, response, 0.0);
    }

    @Test
    public void testExactMatchSameCase() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("java", "java");
        assertEquals(1.0, response, 0.0);
    }

    @Test
    public void testNoSimilarity() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("abc", "def");
        assertEquals(0.0, response, 0.0);
    }

    @Test
    public void score1() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("he", "head");
        assertEquals(0.5d, response, 0.0001d);
    }

    @Test
    public void score2() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("hd", "head");
        assertEquals(0.5d, response, 0.0001d);
    }

    @Test
    public void score3() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("d", "head");
        assertEquals(0.25d, response, 0.0001d);
    }

    @Test
    public void score4() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("head", "he");
        assertEquals(0.5d, response, 0.0001d);
    }

    @Test
    public void score5() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("kitten", "sitting");
        assertEquals(0.5714d, response, 0.0001d);
    }

    @Test
    public void score6() {
        LevenshteinDistanceStrategyRenamed lds = new LevenshteinDistanceStrategyRenamed();
        double response = lds.score("Saturday", "Sunday");
        assertEquals(0.625d, response, 0.0001d);
    }




}
