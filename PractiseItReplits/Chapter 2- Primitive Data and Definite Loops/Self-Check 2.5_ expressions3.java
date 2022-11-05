/*Trace the evaluation of the following expressions, and give their resulting values. Make sure to give a value of 
the appropriate type (such as including a .0 at the end of a double or quotes around a String).*/

2 + 2 + 3 + 4	                            --------> 11
"2 + 2 " + 3 + 4	                        --------> "2 + 2 34"
2 + " 2 + 3 " + 4	                        --------> "2 2 + 3 4"
3 + 4 + " 2 + 2"	                        --------> "7 2 + 2"
"2 + 2 " + (3 + 4)	                      --------> "2 + 2 7"
"(2 + 2) " + (3 + 4)	                    --------> "(2 + 2) 7"
"hello 34 " + 2 * 4	                      --------> "hello 34 8"
2 + "(int) 2.0" + 2 * 2 + 2	              --------> "2(int) 2.042"
4 + 1 + 9 + "." + (-3 + 10) + 11 / 3	    --------> "14.73"
8 + 6 * -2 + 4 + "0" + (2 + 5)	          --------> "007"
1 + 1 + "8 - 2" + (8 - 2) + 1 + 1	        --------> "28 - 2611"
5 + 2 + "(1 + 1)" + 4 + 2 * 3	            --------> "7(1 + 1)46"
"1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9)	--------> "123430717"
