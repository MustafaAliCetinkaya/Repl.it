/*Suppose you have an int variable called number. What Java expression produces the second-to-last digit of the number (the 10s 
place)? What expression produces the third-to-last digit of the number (the 100s place)? (Note: Our code checker won't match 
every possible expression; please come up with the simplest expression using division and modulus.)*/


10s place	   ------------> (number % 100) / 10
100s place	 ------------> (number % 1000) / 100
