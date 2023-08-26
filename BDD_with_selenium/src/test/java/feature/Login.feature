@tag
Feature: Login to Swag lab page 
   User want to login to the Swag Labs page

@tag1
  Scenario: Check the login functionality with accepted usernames and passwords
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should navigate to Swag Labs home page
   
   Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"locked_out_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
   
@tag2
  Scenario: Check the login functionality with valid usernames and invalid passwords
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should not navigate to Swag Labs home page
   
   Examples: 
   |Username | Password |
   |"standard_user"|"secrets_sauce" |
   |"standard_user"|" "  |
   |"standard_user"|""|
   |"locked_out_user"|"secret_sauce" |
   |"locked_out_user"|" " |
   |"locked_out_user"|"" |
   |"problem_user"|"wsecret_sauce" |
   |"problem_user"|" " |
   |"problem_user"|""  |
   |"performance_glitch_user"|"secret_sauced" |
   |"performance_glitch_user"|" "  |
   |"performance_glitch_user"|""  |
   
   
@tag3
  Scenario: Check the login functionality with invalid username and valid password
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should not navigate to Swag Labs home page
   
   Examples: 
   |Username | Password |
   |"wrong_user"|"secret_sauce" |  
   
@tag4
  Scenario: Check the login functionality with invalid usernames and passwords
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should not navigate to Swag Labs home page
   
   Examples: 
   |Username | Password |
   |"wrong_user"|"wrog_password" |
   |""|"secret_sauce" |
   |" "|"" |
   |" " |"secret_sauce" |
   |"" |"" |
   
   
 
