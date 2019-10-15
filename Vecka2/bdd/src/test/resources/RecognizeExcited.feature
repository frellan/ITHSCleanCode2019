Feature: MoodAnalyzer analyses the mood in a sentence
  Scenario: User can provide a sentence and get mood back
    Given The user has created a MoodAnalyzer
    When Sending in the sentence "Jag är så spänd på LoL Worlds idag."
    Then The MoodAnalyzer answers with "EXCITED"