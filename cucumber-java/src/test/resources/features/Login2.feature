
Feature: Login Functionality

Scenario Outline: Verify Login with multiple users
Given login to Tour page
When user enter <username> and <password> with <fullName>
And click on login button
Then he should see logout link

Examples: 
	|username|password|fullName|
	|"admin"|"admin"|"sk kumar"|
	|"admin"|"admin"|"kk kumar"|
	

Scenario: Verify Login
Given login to Tour page
When he enters username and password
And click on login button
Then he should see logout link

Scenario: Verify Login
Given login to Tour page
When he enter valid credentials
	|admin|admin|
And click on login button
Then he should see logout link

Scenario: Verify Successful Login
Given Customer has login to Tour page
When he enters username and password
And click on login button
Then he should see logout link




	



