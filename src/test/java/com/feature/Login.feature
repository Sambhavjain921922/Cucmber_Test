Feature: LogIn to amazon website.
 
  Scenario Outline: User should be Login with Valid Credentials.
  Given The User Launches the browser.
  And User clicks on SignIn link
  When the user Enter '<User_Name>' and '<Password>' 
  Then User should be able to LogIn to the Application.
  
  Examples:
  |User_Name|Password|
  |123456789|Jain123|
  
   Scenario Outline: User should be Login with Valid Credentials.
  Given The User Launches the browser.
  And User clicks on SignIn link
  When the user Enter '<User_Name>' and '<Password>' 
  Then User should be able to LogIn to the Application.
  
  Examples:
  |User_Name|Password|
  |123456789|Jain123|