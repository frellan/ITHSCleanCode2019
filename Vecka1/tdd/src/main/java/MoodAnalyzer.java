public class MoodAnalyzer {

    private MoodAnalyzerUtils utils;

    public MoodAnalyzer(MoodAnalyzerUtils utils) {
        this.utils = utils;
    }

    public String analyzeMood(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (utils.happyWords.contains(word)) {
                return "Happy";
            }
            if (utils.sadWords.contains(word)) {
                return "Sad";
            }
        }
        return "Neutral";
    }
}
