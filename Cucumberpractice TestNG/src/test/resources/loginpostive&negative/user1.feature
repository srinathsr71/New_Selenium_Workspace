Feature: Test OrangeHRM
1)valid case
2)invalid case

Background:
Given I should go to the login page  
@PositiveTesting
Scenario: Checking the login functionality with valid data
And Enter the username "Admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "Paul Collings"
@NegativeTesting
Scenario: Checking the login functionality with invalid data
And Enter the username "admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "Paul Collings"