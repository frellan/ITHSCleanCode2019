import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.List;

public class TestRules {

    static MoodAnalyzer analyzer;

    @BeforeClass
    public static void runBefore() {
        List<String> happyWords = new ArrayList<>();
        happyWords.add("Ja!");
        List<String> sadWords = new ArrayList<>();
        sadWords.add("Nej!");
        MoodAnalyzerUtils utils = new MoodAnalyzerUtils(happyWords, sadWords);
        analyzer = new MoodAnalyzer(utils);
        System.out.println("Resetting models...");
    }
}