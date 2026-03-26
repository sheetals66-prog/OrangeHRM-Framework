Feature:This is the feature file for login page of Orange HRM

Scenario:Login with valid credentials.
Given I am on the login page
When I enter valid username and password and click on login button

Then I should be logged in successfully

Scenario:Login with invalid credentials.
Given I am on the login page
When I enter invalid username and password and click on login button
Then I should see an error message indicating invalid credentials

 