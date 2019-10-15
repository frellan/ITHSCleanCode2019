import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MoodAnalyzerTest extends TestRules {

    @BeforeClass
    public static void setUp() {
        System.out.println("I am on the inside!!!!!");
    }

    @Test
    public void respondsWithHappyWhenStringContainingHappyWords() {
        String text = "Ja! Vad kul!";
        String expected = "Happy";
        String actual = analyzer.analyzeMood(text);
        assertNull(expected);
    }

    @Test
    public void respondsWithSadWhenStringContainingSadWords() {
        String text = "Nej! Inte igen!";
        String expected = "Sad";
        String actual = analyzer.analyzeMood(text);
        assertEquals(expected, actual);
    }
}