Feature: Verify String Operation 
	
	Scenario: Reverse a string
		Given a string "Hello"
		When i reverse it
		Then the output is "olleH"
		
	Scenario: Remove vowel 
		Given a string "Hello" 
		When i remove the vowel 
		Then the output after removing vowel "Hll" 

		 
	Scenario: Find Substring in a string 
		Given a string "Hello" 
		When i search the substring "llo" 
		Then the output should return true 


	Scenario: Find the length of the String 
		Given a string "Hello" 
		When i calculate the length of the string 
		Then the output should be 6 

 
		

		
		
	
	