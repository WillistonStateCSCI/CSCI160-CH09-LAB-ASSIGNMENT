# CSCI160-CH09-LAB
Programming Exercises From Java Illuminated Book by Anderson and Franceschi
## Q09_89 Instructions  
**Note:  There are NO AUTOGRADER TESTS for this problem.  Output from example runs is provided.  Your teacher will grade your work manually.**  
Write a class that encapsulates the evolution of the quality ratings of various hotels over the years.  Hotel ratings are represented by a number of stars, which can vary from one star (lowest quality) to five stars (highest quality).  Your only instance variable should be a two-dimensional array of values representing the quality ratings.  Dimension 1 represents the hotel and dimension 2 represents the year.  Your constructor can take two parameters representing the number of hotels and the number of years.  The ratings can simply be generated randomly.  You should include the following methods:  
- a method returning an array of indexes of the hotels that have earned five stars at least once over the years  
- a method returning the average rating of all the hotels over the years  
- a method printing the indexes of the hotels that have earned five stars every year  
- a method returning *true* if at least one hotel earned five stars for at least one year; *false* otherwise  

A client class is included to help test your code.  Do not make changes to HotelRatingsClient.java.      

### Example Run #1  
```
The hotel ratings are not equal
After changing hr1, the hotel ratings are equal
The ratings were
Hotel\Year
                0       1       2
0               1       2       3
1               2       4       1
2               2       1       4
3               4       1       2

Indexes of hotels having earned five stars at least once: None

Average rating of all hotels over the years: 2.25

Indexes of hotels having earned five stars every year: None

At least one hotel has earned one star one year: false
```

### Example Run #2  
```
The hotel ratings are not equal
After changing hr1, the hotel ratings are equal
The ratings were
Hotel\Year
                0       1       2
0               3       4       2
1               5       4       2
2               2       3       5
3               1       3       3

Indexes of hotels having earned five stars at least once: 1 2 

Average rating of all hotels over the years: 3.0833333333333335

Indexes of hotels having earned five stars every year: None

At least one hotel has earned one star one year: true
```

## 09_95 Instructions  
**Note:  There are NO AUTOGRADER TESTS for this problem.  Output from an example run is provided.  Your teacher will grade your work manually.**  
Write a *Garage* class with on instance variable: an *ArrayList* of *Autos*.  The *Auto* class from this chapter is provided.  
You should include the following methods:  
- a method returning the average number of miles of all cars in the garage  
- a method returning "full" if the garage has 100 cars or more, "below minimum" if the garage has fewer than 25 cars, and "normal load" if the garage has between 25 and 100 cars in it.  
- a method returning the total number of gallons of gas used by all cars in the garage  

A client class is included to help test your code.  Do not make changes to Auto.java or GarageClient.java  

### Sample Run #1  
```
The garages are not equal
After changing g1, the garages are equal
Average number of miles per car in garage: 150.0
Total gallons used by cars in garage: 60.0

With 2 cars, garage occupancy: minimum
After adding 30 cars, garage occupancy: normal load
After adding 80 more cars, garage occupancy: full
```
