Feature: Test demoapp
1)valid case
2)invalid case

Background:
Given I should go to the login page  
@PositiveTesting
Scenario: Checking the login functionality with valid data
And Enter the username "user"
And Enter the password "user"
And Click on the login button
And click on the dropdown button
And I should see the username as "harry harry"
Then Click on the sign out button
@NegativeTesting
Scenario: Checking the login functionality with invalid data
And Enter the username "user"
And Enter the password "admin"
And Click on the login button
