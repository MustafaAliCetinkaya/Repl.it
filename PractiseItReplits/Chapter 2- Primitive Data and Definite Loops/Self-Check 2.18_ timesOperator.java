/*Suppose a real number variable x is defined. Write a single Java statement that stores as a variable y the result of 
the computation below, modifying the expression to use the * operator exactly four times when computing 
an equivalent value (hint: how could you factor out x here?).

y = 12.3x4 - 9.1x3 + 19.3x2 - 4.6x + 34.2
*/

  double y = x * (x * (19.3 + x * (12.3 * x - 9.1)) - 4.6) + 34.2;
