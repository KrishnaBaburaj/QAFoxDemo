Feature: verify user login functionality 

Scenario: verify the user login with valid credentials 
Given user navigates to login page
When user enters valid email "testerkrish@gmail.com"
And user enters valid password "tester123"
And user clicks login button 
Then login sucess message must be displayed