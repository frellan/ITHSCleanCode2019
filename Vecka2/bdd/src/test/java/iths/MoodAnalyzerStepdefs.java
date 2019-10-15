package iths;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MoodAnalyzerStepdefs {
    private MoodAnalyzer moodAnalyzer;
    private String result;

    @Given("^The user has created a MoodAnalyzer$")
    public void theUserHasCreatedAMoodAnalyzer() {
        moodAnalyzer = new MoodAnalyzer();
    }

    @When("^Sending in the sentence \"([^\"]*)\"$")
    public void sendingInTheSentence(String sentence) throws Throwable {
        result = moodAnalyzer.analyzeMood(sentence);
    }

    @Then("^The MoodAnalyzer answers with \"([^\"]*)\"$")
    public void theMoodAnalyzerAnswersWith(String expected) throws Throwable {
        Assert.assertEquals(expected, result);
    }
}
