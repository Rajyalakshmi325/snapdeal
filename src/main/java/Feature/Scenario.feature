@Integrationtesting
Feature: PRODUCT ADDED TO THE CART 

@First
Scenario Outline:
Given User OPEN Browser
When User enters the URL
Then User mouse hover ACCOUNT
When the User clicks on SIGNIN
Then  Enter  "<userName>" and  "<j_password_login_uc>"

And Login to APPLICATION

Given uSER name can be seen on the page
When uSER  search for "Face mask"
Then uSER  select the face mask
And uSER  clicks on product
Then uSER wants to ADD the product to cart
And cLOSE THe BRowseR

Examples:
      |userName                 |j_password_login_uc|
      |rajyalakshmi325@gmail.com|Raji@26       |