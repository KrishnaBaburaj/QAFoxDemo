Feature: verify user login functionality 

Scenario: verify the user login with valid credentials 
Given user navigates to login page
When user enters valid email "testerkrish@gmail.com"
And user enters valid password "tester123"
And user clicks login button 
Then login sucess message must be displayed

Scenario: verify the user login with invalid credentials
Given user navigates to login page
When user enters invalid email "esterkrish@gmail.com"
And user enters invalid password "ester123"
And user clicks login button 
Then login sucess message must be displayed

Scenario: verify the user login with invalid mail and valid password
Given user navigates to login page
When user enters invalid email "esterkrish@gmail.com"
And user enters valid password "tester123"
And user clicks login button 
Then proper error msg should be displayed

Scenario: verify the user login with valid  mail and invalid password
Given user navigates to login page
When user enters valid email "testerkrish@gmail.com"
And user enters invalid password "ester123"
And user clicks login button 
Then proper error msg should be displayed

Scenario: verify the user login without entering any credentials
Given user navigates to login page
And user clicks login button 
Then proper error msg should be displayed

Scenario: verify the forgot password link functionality
Given user navigates to login page
And clicks the forgotpassword link 
Then user shoud navigated to forgotPassword page

Scenario: verify the user login by using keyboard functions
Given user navigates to login page
When user enters valid email "testerkrish@gmail.com" using keyboard
And user enters valid password "tester123"  using keyboard
And user clicks login button  using keyboard
Then login sucess message must be displayed

Scenario: verify the user gets logged out when click back button after logged in 
Given user navigates to login page
When user enters valid email "testerkrish@gmail.com"
And user enters valid password "tester123"
And user clicks login button
And click the back button in the browser
Then user should not be logged out

Scenario: verify the user gets logged in when click back button after logged out 
Given user navigates to login page
When user enters valid email "testerkrish@gmail.com"
And user enters valid password "tester123"
And user clicks login button
And click logout button 
And click the back button in the browser
Then user should not be logged in
