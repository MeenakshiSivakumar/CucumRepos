
Feature: Registration of TestMeApp
  I want to use this template for successful registration of app

   
  Scenario: successful registration of app
  Given User wants to open the Test Me App
  And user has to sign up the app
  Then User fill the username as "Meenakshi Sivakumar"
  Then user fill the firstname as "Meenakshi"
    Then user enter the lastname as "Sivakumar"
    
  Then user enters the password as "12345"
    When user confirms the password as "12345"
    And user enter the gender as "Female"
  And user enter the email id "meena@gmail.com"
  Then  userr has to enter the mobile number "9876543210"
  When user click the image
  Then user enter the month "01"
    Then user enter the date "01"
    Then user enter the year "1998"
  
    
    Then user enters the address as "Vinayaka Street"
  And user must select security questions as "What is your pet name?"
  And user answered for the security questions as "Shinokan"
  And click the register button
  