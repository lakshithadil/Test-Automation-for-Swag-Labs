@tag
Feature: Footer functionality
  User want to use functionalities in footer

@tag1
   Scenario: Check whether footer is displayed
     Given User should login to swag labs using correct <Username> and <Password>
     Then User should see the footer
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |

@tag2
   Scenario: Check whether footer text is displaying correctly
     Given User should login to swag labs using correct <Username> and <Password>
     Then User should see the correct footer text
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
   
@tag3
   Scenario: Check whether twitter is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User clicked the twitter icon
     Then User should navigate to swag labs twitter page
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |
   

@tag4
   Scenario: Check whether facebook is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User clicked the facebook icon
     Then User should navigate to swag labs facebook page
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" |  
   
@tag5
   Scenario: Check whether linkedin is working correctly
     Given User should login to swag labs using correct <Username> and <Password>
     When User clicked the linkedin icon
     Then User should navigate to swag labs linkedin page
      
  Examples: 
   |Username | Password |
   |"standard_user"|"secret_sauce" |
   |"problem_user"|"secret_sauce" |
   |"performance_glitch_user"|"secret_sauce" | 
