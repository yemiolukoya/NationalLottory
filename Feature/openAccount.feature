Feature: Test to verify account opening

Scenario: Test to verify user can open an account with valid credentials

Given the user is on the National lottory website 
When the user click open account
And fill in valid credentials on first page
And fill in valid credentials on second page
Then click open account
And We couldn't confirm your details message is displayed
