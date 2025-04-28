Feature: verify the HomePage functionality 

Scenario: verify the user able to naviagte to register page 
Given user navigates to Home page 
When  user clicks MyAccount dropdown 
And   clicks register button
Then user must navigated to register page

Scenario: verify the user able to naviagte to login page 
Given user navigates to Home page 
When  user clicks MyAccount dropdown 
And   clicks login button
Then user must navigated to login page