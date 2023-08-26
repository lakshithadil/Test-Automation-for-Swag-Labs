@tag
Feature: Cart functionality
  User want to use all cart functions correctly

@tag1
   Scenario: Check whether user can see the cart badge get updated when add items to cart
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the add to cart button <itemNumber>
     Then User should see the updated cart badge
      
  Examples: 
   |Username | Password |itemNumber|
   |"standard_user"|"secret_sauce" |0|
   |"problem_user"|"secret_sauce" |0|
   |"performance_glitch_user"|"secret_sauce" |0|
   |"standard_user"|"secret_sauce" |1|
   |"problem_user"|"secret_sauce" |1|
   |"performance_glitch_user"|"secret_sauce" |1|
   |"standard_user"|"secret_sauce" |2|
   |"problem_user"|"secret_sauce" |2|
   |"performance_glitch_user"|"secret_sauce" |2|
   |"standard_user"|"secret_sauce" |3|
   |"problem_user"|"secret_sauce" |3|
   |"performance_glitch_user"|"secret_sauce" |3|
   |"standard_user"|"secret_sauce" |4|
   |"problem_user"|"secret_sauce" |4|
   |"performance_glitch_user"|"secret_sauce" |4|
   |"standard_user"|"secret_sauce" |5|
   |"problem_user"|"secret_sauce" |5|
   |"performance_glitch_user"|"secret_sauce" |5|
   
   
@tag2
   Scenario: Check whether user can see the remove button when add items to cart
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the add to cart buttons
     Then User should see the remove button
     
    Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
     
   
@tag3
   Scenario: Check whether user can see the full product view
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the product title <itemNumber>
     Then User should see the full product view 
     
    Examples: 
   |Username | Password |itemNumber|
   |"standard_user"|"secret_sauce" |0|
   |"problem_user"|"secret_sauce" |0|
   |"performance_glitch_user"|"secret_sauce" |0|
   |"standard_user"|"secret_sauce" |1|
   |"problem_user"|"secret_sauce" |1|
   |"performance_glitch_user"|"secret_sauce" |1|
   |"standard_user"|"secret_sauce" |2|
   |"problem_user"|"secret_sauce" |2|
   |"performance_glitch_user"|"secret_sauce" |2|
   |"standard_user"|"secret_sauce" |3|
   |"problem_user"|"secret_sauce" |3|
   |"performance_glitch_user"|"secret_sauce" |3|
   |"standard_user"|"secret_sauce" |4|
   |"problem_user"|"secret_sauce" |4|
   |"performance_glitch_user"|"secret_sauce" |4|
   |"standard_user"|"secret_sauce" |5|
   |"problem_user"|"secret_sauce" |5|
   |"performance_glitch_user"|"secret_sauce" |5|

 @tag4
   Scenario: Check whether user can see the cart items added to cart
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the add to cart buttons
     And User click the cart icon
     Then User should see the cart items added to cart
 
   Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
     
 @tag5
   Scenario: Check whether user can remove cart items from cart
     Given User should login to swag labs using correct <Username> and <Password>
     And User click the add to cart buttons
     And User click the cart icon
     When User click the remove buttons
     Then User should see the cart without removed item
 
   Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" | 
     
   
 @tag6
   Scenario: Check whether user can go to products when full product view
     Given User should login to swag labs using correct <Username> and <Password>
     And User click the product title <itemNumber>
     When User click the back to products button
     Then User should see the product page 
     
  Examples: 
   |Username | Password |itemNumber|
   |"standard_user"|"secret_sauce" |0|
   |"problem_user"|"secret_sauce" |0|
   |"performance_glitch_user"|"secret_sauce" |0|
     
 @tag7
   Scenario: Check whether user can go to shop from cart
     Given User should login to swag labs using correct <Username> and <Password>
     And User click the add to cart buttons
     And User click the cart icon
     When User click the continue shopping button
     Then User should see the product page
 
   Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |     
  
 @tag8
   Scenario: Check whether user can go to checkout from cart
     Given User should login to swag labs using correct <Username> and <Password>
     And User click the add to cart buttons
     And User click the cart icon
     When User click the checkout button
     Then User should see the checkout info page
 
   Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" | 