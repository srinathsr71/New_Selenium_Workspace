Feature: Test demoapp
1)valid case
2)invalid case

Background:
Given I should go to the login page  
@PositiveTesting
Scenario: Checking the login functionality with valid data
And Enter the username "<user>"
And Enter the password "<pass>"
And Click on the login button
And click on the dropdown button
And I should see the username as "<username>"
Then Click on the sign out button
Examples:
|user |pass|username|
|admin|admin|SkillRary Admin|
|user |user|harry harry|

@NegativeTesting
Scenario: Checking the login functionality with invalid data
And Enter the username "<user>"
And Enter the password "<pass>"
And Click on the login button
And click on the dropdown button
And I should see the username as "<username>"
Then Click on the sign out button
Examples:
|user |pass|username|
|admin1|admin|SkillRary Admin|
|user1 |user|harry harry|