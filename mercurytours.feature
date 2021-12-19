@test
Feature: Mercury tours demo
 Background:
 Given user has browser open

  
  Scenario: User can navigate to homepage
    Then user checks if aruba image is diplayed
    And user checks if mercury image is displayed
    And user checks if register link is working
    Then user clicks on register link
    And user checks if signon link is working
    Then user clicks on signon link
    
  	

	 Scenario: User can navigate to register page and register
 		When I click on register
 		And User checks if register message appears
 		Then user enters contact information
 		Then user enters mailing information
 		Then user enters user information
 		And user clicks submit
 		And user checks if account was made 
 
 
 
 		Scenario: User can navigate to sigon page and signOn
 		And user clicks on sign on page
 		And user checks if sign on message is appears
 		Then user enters username
 		Then user enter password
 		Then user clicks on submit button
 		And user checks if they are on a new page
 		
 		
 		Scenario: User can navigate to insurance project and register
 		Then i click on insurance project page
 		And i click on the register button
 		Then i sign up as new user
 		Then i click login
 		Then i validate if my account was signed in
 		
 		Scenario: User can navigate to Agileproject and signin
 		Then i click on agile project
 		Then i sign in
 		And user should see welcome message when signed in
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
