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

5. Method: 
Line(s) of Code:
```java

```
Mutant: 
Analysis: 

# Report all the statistics and the mutation score for each test class

# Analysis drawn on the effectiveness of each of the test classes

# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

# Explain your SELENUIM test case design process

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# How the team work/effort was divided and managed

# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the assignment itself
