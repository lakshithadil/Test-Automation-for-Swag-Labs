@tag
Feature: Display login error messages 
   User want to see correct error message when login to the Swag Labs is failed


@tag1
  Scenario: Check the error message when login with blank username and password
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should see the correct error message

   Examples: 
   |Username | Password |
   |""|"" |
  
@tag2
  Scenario: Check the error message when login with blank username and some password
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should see the correct error message

   Examples: 
   |Username | Password |
   |""|"something" |
   
@tag3
  Scenario: Check the error message when login with some username and blank password
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should see the correct error message

   Examples: 
   |Username | Password |
   |"something"|"" |
   
   
@tag4
  Scenario: Check the error message when login with wrong username and password
    Given User should navigate to swag labs login page
    When User enter the <Username> and <Password>
    And User click the login button
    Then User should see the correct error message

   Examples: 
   |Username | Password |
   |"something"|"somethings" |  
   
   