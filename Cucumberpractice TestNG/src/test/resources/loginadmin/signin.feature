Feature: Test demoapp
Scenario: To test login functionality of admin
Given I should go to the login page  
And Enter the username "admin"
And Enter the password "admin"
And Click on the login button
Then I should see the username as "SkillRary Admin"  