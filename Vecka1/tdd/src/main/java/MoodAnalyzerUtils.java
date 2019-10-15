import java.util.List;

public class MoodAnalyzerUtils {

    public List<String> happyWords;
    public List<String> sadWords;

    public MoodAnalyzerUtils(List<String> happyWords, List<String> sadWords) {
        this.happyWords = happyWords;
        this.sadWords = sadWords;
    }
}
