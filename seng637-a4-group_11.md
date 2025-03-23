**SENG 637 - Dependability and Reliability of Software Systems**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:      |  11   |
| -------------- | --- |
| Student Names: |     |
| Steven Au      |     |
|Laurel Flanagan |     |
|Rhys Wickens    |     |
|Austen Zhang    |     |

# Introduction
Rhys to fill in 

# Analysis of 10 Mutants of the Range class 

1. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower
 + ")<= upper (" + upper + ").";
``` 
Mutant: removed call to java/lang/StringBuilder::toString → SURVIVED 
Analysis: This mutant was not killed by the original test suite. This mutant survived because the original test cases only tested whether an exception is thrown when an invalid range is attempted to be created (a range with lower > upper) and the error message itself was not tested to check whether it contains the expected contents. A test needs to be added to check a part of the error message in addition to the exception to kill this mutant. 

2. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower
 + ")<= upper (" + upper + ").";
```  
Mutant: replaced call to java/lang/StringBuilder::append with receiver → SURVIVED  
Analysis: This mutant was not killed by the original test suite. This mutant also affects the construction of the error message for when an invalid range is attempted to be created, specifically related to the string concatenation of the message. Therefore, if the test doesn’t assert that the message is part of the exception (and only checks if the exception is thrown), this would not cause the test to fail. A test needs to be added to check whether the exact error message expected is received when creating an invalid range. 

3. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower 
+ ")<= upper (" + upper + ").";
```   
Mutant: Incremented (++a) double local variable number 1 -> SURVIVED  
Analysis: This mutant was not killed by the original test suite. This mutant increments the value of lower with the prefix operator, therefore when the value reaches the check if (lower > upper) within the constructor, the result may not be what is expected based on the original values of lower and upper. For example, if (9.0, 9.5) were passed to the Range constructor, this should be valid since lower is less than upper. But if lower is incremented due to the mutant on the line if (++lower > upper), then lower will be 10.0 and the expression will evaluate to true, and an Illegal Argument Exception would be thrown. Therefore, there needs to be a test case added that considers values of lower and upper close together such as 9.0 and 9.5 so that this mutant would be caught.  

4. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower
 + ")<= upper (" + upper + ").";
```  
Mutant: Decremented (--a) double local variable number 1 -> SURVIVED  
Analysis: Like the mutant above, this mutant was also not killed by the original test suite. This mutant decreases the value of lower with the prefix operator, so that when the value reaches the line with if (lower > upper), this is changed to if (--lower > upper). Therefore, if the values of (10.0, 9.5) are passed to the Range constructor, this should not be a valid range since lower is greater than upper. But with the decrement mutant, the expression evaluates 9.0 and 9.5, which results in false. This mutant also requires a test case where values of lower and upper are close together so that the decrement results in a different evaluation of the if statement.  
 
5. Method: `public double getCentralValue()`  
Line(s) of Code:
```java
 return this.lower / 2.0 + this.upper / 2.0;
``` 
Mutant: replaced double return with 0.0d for org/jfree/data/Range::getCentralValue → SURVIVED 
Analysis: This mutant was not killed by the original test suite. This mutant would make 0 the result returned, not matter what the lower and upper values of the range the method was called on were. In this case, this mutant survived because we only had one test case for the getCentralValue method, which was the example given in Assignment 2. This method was not chosen for writing tests in Assignment 2 and more tests were not required for this method to increase coverage in Assignment 3. In the one test that our suite did have for getCentralValue, it tests on the range (-1, 1), which the central value is 0. Therefore, this one test does not kill this mutant. In order to kill this mutant, we need to add a test case for a range that does not have a central value of 0.  


Steven to add 5 more  

# Report all the statistics and the mutation score for each test class

Laurel to fill in 

# Analysis drawn on the effectiveness of each of the test classes

Laurel to fill in 
compare to results from original test suites (how good was mutation score with test suite from assignment 3) 

# A discussion on the effect of equivalent mutants on mutation score accuracy
Steven to fill in 

# A discussion of what could have been done to improve the mutation score of the test suites
Austen to fill in 

# Why do we need mutation testing? Advantages and disadvantages of mutation testing
Rhys to fill in 

# Explain your SELENUIM test case design process
Everyone to add a couple lines about your cases 

# Explain the use of assertions and checkpoints
Austen to fill in 

# how did you test each functionaity with different test data
Steven to fill in, Austen to add some 

# How the team work/effort was divided and managed
Laurel to fill in 

# Difficulties encountered, challenges overcome, and lessons learned
Rhys to fill in 

- difficulties with GUI testing with different machines and browsers and website appears differently sometimes
- mutation testing - identifying why a mutant was killed or not killed 

# Comments/feedback on the assignment itself

Rhys to fill in 
