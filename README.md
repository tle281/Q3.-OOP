Q3. JAVA – OOPS [20 Marks]
 Given an interface named "OnlineAccount" that models the account of popular online video streaming platforms, perform the operations listed below. The interface "OnlineAccount" consists of the basePrice, regularMoviePrice, and exclusiveMoviePrice.
In order to complete this challenge, you need to implement an incomplete class named "Account" which implements the "OnlineAccount" interface as well as the "Comparable<Account>" interface.
Class Account has two attributes to keep track of the number of movies watched:
Integer noOfRegularMovies
Integer noOfExclusiveMovies
String ownerName
 Methods to complete for class Account:
Add a parameterized constructor that initializes the attributes ownerName, numberOfRegularMovies, and numberOfExclusiveMovies.
Int monthlyCost() => This method returns the monthly cost for the account. [Monthly Cost = base price + noOfRegularMovies*regularMoviePrice + noOfExclusiveMovies*exclusiveMoviePrice]
Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
String toString() which returns => "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
Feed(Give input via main program) and Compare the 3 accounts and return the details of the account with the greatest expenditure.
