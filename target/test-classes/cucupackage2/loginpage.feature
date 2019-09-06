 
 Feature: Login
  I want to use this template for successful login

  
  Scenario: Login page
  Given user wants to open the app
  Then user click sign in
    Given user wants to enter the "Username"
    Then user enter the "password"

         And press the login button
   
      | Username  | Password | 
      | AlexUser   |  Alex@123| 
      