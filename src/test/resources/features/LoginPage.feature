Feature: As a user, I should be able to Login successfully into 99acres website  
 
Background: 
	Given User open 99acres website 
	
Scenario Outline: Login to the Application with valid username and valid password 
	When user click on Hamburger icon
	And user click on register button 
	And user enter "<Username>" "<Password>" in input box
	Then user click on Login button
	
	Examples:
	|Username                 |Password    |
	|test858@gmail.com        |Satish@123  |
	
	
Scenario Outline: show and hide the password 
	When user click on Hamburger icon
	And user click on register button 
	And user enter "<Name>" "<E-mail>" "<Password>" in input box
	And user click on show button
	And user click on hide button
	Then user click on Register Now button
	
	Examples:
	|Name    |E-mail           |Password    |
	|test    |test858@gmail.com|Satish@123  |
	

@negative	
Scenario Outline: Register a new user with invalid email and invalid phone number
	When user click on Hamburger icon
	And user click on register button 
	And user enter "<Name>" "<E-mail>" "<Password>" "<Mob Num>" in input box
	Then user click on Register Now button
	
	Examples:
	|Name    |E-mail            |Password    |Mob Num    |
	|test    |test@123@gmail.com|Satish@123  |98765      |
	
@negative	
Scenario Outline: Register a new user by leaving name and email textboxes empty
	When user click on Hamburger icon
	And user click on register button 
	And user enter "<Name>" "<E-mail>" "<Password>" "<Mob Num>" in input box
	Then user click on Register Now button
	
	Examples:
	|Name    |E-mail            |Password    |Mob Num    |
	|        |                  |Satish@123  |9876543210 |
	



	
	 
	

