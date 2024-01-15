Feature:Test guru login page
1)valid
2)Invalid
Scenario Outline:To test the login functionality of guru99
Given I should be in the login page
@PositiveTesting
Scenario: to test the login with valid data
When Enter Username "<user>"
And Enter password "<pass>"
Then user should be login page 

Examples:
|user|pass|
|user|user|
|admin|admin|

@NegativeTesting
Scenario:To test the login with invalid data
When Enter username "<user>"
And  Enter password "<pass>"
Then  user should not be in login page

Examples:
|user|pass|
|234@|234@|
|456!|456@|