Feature: Test demoapp
Scenario: To test login functionality of user
Given I should go to the login page  
And Enter the username "user"
And Enter the password "user"
And Click on the login button
Then I should see the username as "harry harry"