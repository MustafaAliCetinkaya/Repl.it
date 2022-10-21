### Create a program that will maintain a shopping list. This shopping list will have the name of the items, the price of the items, and the quantity of items that will be purchased. The program will ask the user to enter the name, price, and quantity of each item and the program will then ask if they want to add another item. Repeat for any number of times the user wants, but when the user is done adding to the shopping list print a receipt for the user with a total cost of this shopping trip. Follow the steps below

> - Create a `Scanner` object
> - Ask the user to enter the name of the item with the message: `Enter the name of item x` where x is an item number starting from 1, 2, etc
> - Ask the user to enter the price of the item using the message: `Enter the price of the $itemName`, where itemName is the same asked in the previous step
> - Ask the user to enter the quantity they will buy using the message: `How many $itemName will you buy?`, where itemName is the same asked in the second step
> - Build the total receipt of this item and add it to the final `shopping list`. Also add the `total cost` of the item to the total `cost of the shopping trip`. Use this format to create each items' receipt:
```
  $itemName x $quantity - $totalPriceOfThisItem
  Where:
  itemName: the name of the item
  quantity: the total number of this item being bought
  totalPriceOfThisItem: the total cost of this item which is calculated as the (quantity * price)
```
> - Ask the user if they want to add more items to the list using the message, `Do you want to add more items to the shopping list?`

> - If the user says `yes` then repeat all of the steps above, starting from step 2

> - If the user says `no` then stop asking for items and print out the total shopping list and the total cost of the shopping trip in the following format:

```
  SHOPPING LIST:
  receipt item 1
  receipt item 2
  receipt item 3
  ... etc
  Total cost: $totalCostOfTrip
```

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements, concatenation

Example Flow:
```
Enter the name of item 1
  cheese
Enter the price of the cheese
  3.5
How many cheese will you buy?
  5
Do you want to add more items to the shopping list?
  yes
Enter the name of item 2
  apples
Enter the price of the apples
  2
How many apples will you buy?
  10
Do you want to add more items to the shopping list?
  yes
Enter the name of item 3
 tomatoes
Enter the price of the tomatoes
  0.99
How many tomatoes will you buy?
  15
Do you want to add more items to the shopping list?
  no

SHOPPING LIST:
cheese x 5 - $17.5
apples x 10 - $20.0
tomatoes x 15 - $14.85
Total cost: $52.35
```
