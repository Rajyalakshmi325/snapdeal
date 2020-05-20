@EndtoEndtesting
Feature: Add to Cart 

Background:

Given User Opens chrome Browser
When User enters the url 
Then User mouse hover Account
When the User clicks on Sigin Button
Then Enter the Enter userName and j_password_login_uc
|rajyalakshmi325@gmail.com|Raji@26|
And Login to application

@First
Scenario:
Given MOve to the categories
Then user SElect The Product
When user CLicks On Product
Then user wants to ADD the product to cart
And close THe BRowser

@Second
Scenario:
Given rEMOve the product from the Cart





