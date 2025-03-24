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

### 1. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower
 + ")<= upper (" + upper + ").";
``` 
**Mutant**: removed call to java/lang/StringBuilder::toString → SURVIVED 
**Analysis**: This mutant was not killed by the original test suite. This mutant survived because the original test cases only tested whether an exception is thrown when an invalid range is attempted to be created (a range with lower > upper) and the error message itself was not tested to check whether it contains the expected contents. A test needs to be added to check a part of the error message in addition to the exception to kill this mutant. 

### 2. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower
 + ")<= upper (" + upper + ").";
```  
**Mutant**: replaced call to java/lang/StringBuilder::append with receiver → SURVIVED  
**Analysis**: This mutant was not killed by the original test suite. This mutant also affects the construction of the error message for when an invalid range is attempted to be created, specifically related to the string concatenation of the message. Therefore, if the test doesn’t assert that the message is part of the exception (and only checks if the exception is thrown), this would not cause the test to fail. A test needs to be added to check whether the exact error message expected is received when creating an invalid range. 

### 3. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower 
+ ")<= upper (" + upper + ").";
```   
**Mutant**: Incremented (++a) double local variable number 1 -> SURVIVED  
**Analysis**: This mutant was not killed by the original test suite. This mutant increments the value of lower with the prefix operator, therefore when the value reaches the check if (lower > upper) within the constructor, the result may not be what is expected based on the original values of lower and upper. For example, if (9.0, 9.5) were passed to the Range constructor, this should be valid since lower is less than upper. But if lower is incremented due to the mutant on the line if (++lower > upper), then lower will be 10.0 and the expression will evaluate to true, and an Illegal Argument Exception would be thrown. Therefore, there needs to be a test case added that considers values of lower and upper close together such as 9.0 and 9.5 so that this mutant would be caught.  

### 4. Method: `public Range(double lower, double upper)` 
Line(s) of Code: 
```java
if (lower > upper): 
String msg = "Range(double, double): require lower ("+ lower
 + ")<= upper (" + upper + ").";
```  
**Mutant**: Decremented (--a) double local variable number 1 -> SURVIVED  
**Analysis**: Like the mutant above, this mutant was also not killed by the original test suite. This mutant decreases the value of lower with the prefix operator, so that when the value reaches the line with if (lower > upper), this is changed to if (--lower > upper). Therefore, if the values of (10.0, 9.5) are passed to the Range constructor, this should not be a valid range since lower is greater than upper. But with the decrement mutant, the expression evaluates 9.0 and 9.5, which results in false. This mutant also requires a test case where values of lower and upper are close together so that the decrement results in a different evaluation of the if statement.  
 
### 5. Method: `public double getCentralValue()`  
Line(s) of Code:
```java
 return this.lower / 2.0 + this.upper / 2.0;
``` 
**Mutant**: replaced double return with 0.0d for org/jfree/data/Range::getCentralValue → SURVIVED 
**Analysis**: This mutant was not killed by the original test suite. This mutant would make 0 the result returned, not matter what the lower and upper values of the range the method was called on were. In this case, this mutant survived because we only had one test case for the getCentralValue method, which was the example given in Assignment 2. This method was not chosen for writing tests in Assignment 2 and more tests were not required for this method to increase coverage in Assignment 3. In the one test that our suite did have for getCentralValue, it tests on the range (-1, 1), which the central value is 0. Therefore, this one test does not kill this mutant. In order to kill this mutant, we need to add a test case for a range that does not have a central value of 0.  

### 6. Method: `public boolean intersects(double b0, double b1)`
Line(s) of Code:
```java
if (b0 <= this.lower) {
    return (b1 > this.lower);
}
else {
    return (b0 < this.upper && b1 >= b0);
}
```
**Mutant**: changed conditional boundary → SURVIVED
**Analysis**: This mutant was not killed by the original test suite. In this case, there are two test cases which test the case where `b0 == this.lower` for the conditional statement `b0 <= this.lower`. Without mutating the conditional, the condition evaluates to `true`. The method then checks the condition for `b1 > this.lower` which evaluates to `true`. In the case that the conditional boundary is mutated by the mutant to evaluate the conditional `b0 < this.lower`, we find that our test case will evaluate to `false`. The method would move to the `else` block to check `(b0 < this.upper && b1 >= b0)`. This conditional returns `true` in our test cases. For these test cases, the method evaluates to `true` despite the change in conditional and does not expose the difference in behaviour due to the mutation. In order to kill this mutant, we would need to modify the existing test case (Test Case 16) where the `else` conditional produces a different result.

### 7. Method: `public boolean intersects(double b0, double b1)`
Line(s) of Code:
```java
if (b0 <= this.lower) {
    return (b1 > this.lower);
}
else {
    return (b0 < this.upper && b1 >= b0);
}
```
**Mutant**: Incremented (a++) double local variable number 3 → SURVIVED
**Analysis**: The third local variable refers to the first instance of `b1` in the above lines of code. This mutant was not killed by the original test suite for intersects. In the original test suite, Test Case 12 to 16 did not identify the behaviour of the mutant. For Test Cases 12 and 13, the ranges fully or partially overlap, so incrementing `b1` will always result in `true`. In Test Case 14 which tests for no overlap, for the selected values, incrementing `b1` does not change the return value which is `false`. For Test Cases 15 and 16, the ranges touch the boundaries, so the conditional statement for `b1 > this.lower` does not get evaluated and the resulting return value will be `true`. In order to kill this mutant, we would need a test case where incrementing `b1` changes the result. Adding a test case where `b1` is less than `b0` by one would expose the difference in behaviour.


### 8. Method: `public boolean intersects(double b0, double b1)`
```java
if (b0 <= this.lower) {
    return (b1 > this.lower);
}
else {
    return (b0 < this.upper && b1 >= b0);
}
```
**Mutant**: greater than to not equal → SURVIVED
**Analysis**: This mutant changes the conditonal statement for `b1 > this.lower` to `b1 != this.lower`. This relates to test cases where the conditinal statement `b1 > this.lower` is reached. In the original test suite which correspond to Test Case 15 - 17. In the original test cases, when the conditional for `b1 > this.lower` is reached, `b1` is not equal to `this.lower`. When the mutant is applied and changes the conditional statement to `b1 != this.lower`, the test case still evaluates to true and does not expose the differeing behaviour. In order to kill the mutant, a test case is needed where `b1 != this.lower` evaluates to false. 

### 9. Method: `public boolean equals(Object obj)`
```java
if (this == obj) { 
    return true;
}
```
**Mutant**: negated conditional → KILLED
**Analysis**: This mutant is killed by Test Case 29. In test case 29, we compare two instances of `Range` which evaluates to `false`. The conditional we are evaluation returns `false` because they are different `Range` objects. When the condition is applied and `this == obj` is negated and evaluates as `true`, the method returns `true`. In this case, the change in behaviour is detected, so it is killed by Test Case 29.

### 10. Method: `public boolean equals(Object obj)`
```java
if (!(obj instanceof Range)) {
    return false; 
}
```
**Mutant**: replaced boolean return with false for org/jfree/data/Range::equals → KILLED
**Analysis**: This mutant is killed by Test Case 33 which tests equality of an instance of `Range` with a null range. The `Range` object calls the `equals` method and passes `null` as the argument. `null` is not a Range object so the condition evaluates to `true` and the method returns `false`. The mutant changes this return value to `true`, and the method then returns `true`. Because this changes the return value, the change in behaviour is caught by the test case. This is generally applicable to most mutants in our suite which have the return value changed.

# Report all the statistics and the mutation score for each test class

Laurel to fill in 

# Analysis drawn on the effectiveness of each of the test classes

Laurel to fill in 
compare to results from original test suites (how good was mutation score with test suite from assignment 3) 

# A discussion on the effect of equivalent mutants on mutation score accuracy
Equivalent mutants are mutants which are introduced to the original source code that are not detected by the test suite. In these cases, we can usually conclude that the test suite is inadequate to kill the mutants which were introduced. Equivalent mutants SURVIVE the mutation test, and must be manually inspected in order to evaluate the tests. In this exercise, we found that mutation testing helped us evaluate the quality of our test cases. In certain instances, modifying the input values to the test cases was enough to catch the mutation. Doing so required careful inspection of the code. In addition, mutation testing was found to be computationally intensive, taking several minutes before the coverage report was produced by PITest for our test suite. Due to this computational restriction, a careful approach was required of the programmer in order to identify test cases or modifications to test cases in order to kill mutants. However, in the case of equivalent mutants, the test suite would not be able to catch the mutant and must be excluded from the score calculation, otherwise the score can be distorted.

An equivalent mutant which survived the mutation test had to be evaluated against all the test cases which test the method of interest. This is an important step in identifying which tests actually reach the mutated statement. In order to identify solutions to kill surviving mutants, we had to identify the test cases which actually reach the mutated statement. Only then could you perform an analysis on how the mutant survived. It was found that test coverage alone does not mean you have a quality test suite. 

We also found that equivalent mutants can impact the mutation score accuracy by distorting the mutation score to give the impression that the test suite is less effective than it is in practice. A slow and careful process must be followed in order to review surviving mutants. Identifying equivalent mutants and excluding not only helps your mutation score truly reflect the quality of the test suite, but it also allows you to find the mutants which actually impact your test suite quality. This impact on the accuracy artificially deflates the mutation score, and additionally makes it more cumbersome for developers who are trying to kill the mutants that actually improve the test suite quality. By identifying and excluding equivalent mutants, the mutation score becomes more accurate and reliable, and becomes a better measurement of the true quality of your test suite.

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
