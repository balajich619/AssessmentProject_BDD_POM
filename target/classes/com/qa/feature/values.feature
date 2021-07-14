Feature: Mass Mutual QA Assessment - Values 

@Functional
Scenario: Validate Value details

Given user is on Values Page
Then validate the count of values in the screen
Then validate values are greater than zero
Then validate the total balance
Then validate the currency format of the values
