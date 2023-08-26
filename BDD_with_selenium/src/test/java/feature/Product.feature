@tag
Feature: Product page functionality 
  User want to use functionalities in Product page

@tag1
   Scenario: Check whether product title label is displayed
     Given User should login to swag labs using correct <Username> and <Password>
     Then User should see the product title label
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
   
   
@tag2
   Scenario: Check whether product sort option is displayed
     Given User should login to swag labs using correct <Username> and <Password>
     Then User should see the product sort option
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
 
@tag3
   Scenario: Check whether inventory items are displayed correctly
     Given User should login to swag labs using correct <Username> and <Password>
     Then User should see the products correctly
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
   
@tag4
   Scenario: Check whether product sort option ZA is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the sort ZA 
     Then User should see the ZA sorted products
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |  

@tag5
   Scenario: Check whether product sort option AZ is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the sort AZ
     Then User should see the AZ sorted products 
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |   
   

@tag6
   Scenario: Check whether product sort option low to high is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the sort low to high
     Then User should see the low to high sorted products 
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |      
  


@tag7
   Scenario: Check whether product sort option high to low is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User click the sort high to low
     Then User should see the high to low sorted products 
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |  
   
       
@tag8
   Scenario: Check whether product images are displayed correctly
     Given User should login to swag labs using correct <Username> and <Password>
     Then User should see the correct products images
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |  


 