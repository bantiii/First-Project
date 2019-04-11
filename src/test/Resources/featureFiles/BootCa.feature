Feature: signup for yelp account 
	As anew yelp user 
       I should be able to sign up
       
@Smoke 
Scenario Outline: cheking yelp signup functionality 
	Given user lands on yelp home page 
	Then Click on Signup button 
	Then user enter "<firstname>" "<value>" 
	Then user enter "<lastname>" "<value2>" 
	Then user enter "<emai>" "<value3>" 
	Then user enter "<pass>" "<value4>" 
	Then user enter "<zip>" "<value5>" 
	Then user select month 
	Then  user select date 
	Then  user select year 
	Then Click on Signup buttonn 
	
	
	#	Then get all links
	#	Then user take screenshot
	#	
	Examples: 
		|firstname|value      |lastname|value2|emai |value3               |pass    |value4             |zip|value5|
		|firstn   |Bantamelak |lastna  |Tafete|email|tafete21@gmail.com|password|fasika2112|zipp|20887|
		
		
		
		
		
	