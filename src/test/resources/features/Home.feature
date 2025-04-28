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

Scenario: verify the functionality of the Currency Dropdown 
Given user navigates to Home page 
When user clicks the currency Dropdown 
And Clicks the euro currency 
Then the product price must be changed to euro

Scenario: verify the functionality of the Currency Dropdown 
Given user navigates to Home page 
When user clicks the currency Dropdown 
And Clicks the Pound currency 
Then the product price must be changed to pound

Scenario: verify the functionality of the Currency Dropdown 
Given user navigates to Home page 
When user clicks the currency Dropdown 
And Clicks the dollars currency 
Then the product price must be changed to dollars

Scenario: verify the functionality wishlist without logging in 
Given user navigates to Home page 
And user clicks the wishlist button 
Then user must navigated to login page

Scenario: verify the functionality of the Shopping cart
Given user navigates to Home page 
And Clciks the shopping cart button
Then user must be navigated to shopping cart page 

Scenario: verify the functionality of the checkout button
Given user navigates to Home page 
And Clciks the Checkout button
Then user must be navigated to shopping cart page 

Scenario: verify the search fucntionality
Given user navigates to Home page 
When user enters valid product name "imac"
And clicks the Search button 
Then the search results must be displayed 
