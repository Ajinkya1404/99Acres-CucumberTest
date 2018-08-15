Feature: As a user, I should be able to Register a new user in 99acres website  
 
Background: 
	Given User open 99acres website 
	
Scenario Outline: Register a new user 
	When user click on Hamburger icon
	And user click on register button 
	And user enter "<Name>" "<E-mail>" "<Password>" "<Mob Num>" in input box
	Then user click on Register Now button
	
	Examples:
	|Name    |E-mail           |Password    |Mob Num    |
	|test    |test858@gmail.com|Satish@123  |9876543210 |
	
	

	



	
	 
	

