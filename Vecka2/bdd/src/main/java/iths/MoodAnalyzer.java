package iths;

public class MoodAnalyzer {
    public static void main(String[] args) {
        MoodAnalyzer mood = new MoodAnalyzer();
        String result = mood.analyzeMood("Jag är ledsen");
        System.out.println(result);
    }

    public String analyzeMood(String text) {
        if (text.contains("glad")) {
            return "HAPPY";
        } else if (text.contains("ledsen")) {
            return "SAD";
        } else if (text.contains("spänd")) {
            return "EXCITED";
        } else {
            return "NEUTRAL";
        }
    }
}
