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
## Before Adding Tests to Increase Mutation Score (Metrics with test suite from Assignment 3)
The following screenshots show the mutation score before adding tests to improve the score for the DataUtilities and Range classes. These metrics reflect the status of the mutation score based on the test suites from Assignment 3. 

**Data Utilities** 
![Assgn 3 Mutation Score DataUtilities](2_mutation_testing/pitest_screenshots/baseline_coverage_report_DataUtilities.png) 

**Range** 
![Assgn 3 Mutation Score Range](2_mutation_testing/pitest_screenshots/baseline_coverage_report_Range.png) 

As noted in the assignment instructions, the goal is to improve the mutation score by 10%. Therefore, since the Range class has mutation coverage of 70%, we aim to increase the mutation coverage to 80%. Since the DataUtilities class has mutation coverage of 87%, the aim would be to increase to 97%. It is noted that the coverage for DataUtilities is very high initially, and increasing to 97% may not be feasible due to equivalent mutants and other factors. This is discussed further below. 

## Mutation Tests In Progress (Intermediate Metrics) 
The following screenshots show the progress of improving the mutation score as more tests were added. 

**Data Utilities**  

Laurel to fill in 


**Range** 
After adding tests to cover methods that were not explicitly tested as part of Assignment 2 or 3, and a few additional tests to target specific mutants, the mutation coverage score was increased to 73%. This included tests to cover the constructor `Range(double lower, double upper)`, and the methods `getCentralValue()`, and `toString()`.  

![Increase Range to 73](2_mutation_testing/pitest_screenshots/increase_to_73_Range.png)

Additional tests were added to specifically target many of the mutants associated with incrementing and decrementing variables. These tests were designed with variable values close together such that an increment or decrement of one value could lead to a different outcome. The mutation score for Range was increased to 78% at this point. 

![Increase Range to 78](2_mutation_testing/pitest_screenshots/increase_to_78_Range.png)


## After Adding Tests to Increase Mutation Score (Final Metrics)

Laurel to fill in 


# Analysis drawn on the effectiveness of each of the test classes   
Based on the information provided in the previous section, the test suite for DataUtilities from Assignment 3 without additional test was already quite effective for killing mutants with a mutation coverage score of 87%. The test suite for Range was also relatively effective with a mutation coverage score of 70%. In Assignment 2, unit test cases were designed to be quite comprehensive based on equivalence class partitioning and boundary value conditions. Then in Assignment 3, the statement, branch and condition coverage were increased by adding additional test cases. Therefore, the test suite coming out of Assignment 3 was pretty robust, which is what lead to these initial scores for mutation coverage. 
 
 
Laurel to add more comments about final effectiveness 


# A discussion on the effect of equivalent mutants on mutation score accuracy
Steven to fill in 

# A discussion of what could have been done to improve the mutation score of the test suites
Austen to fill in 

# Why do we need mutation testing? Advantages and disadvantages of mutation testing
Rhys to fill in 

# Explain your SELENUIM test case design process
Everyone to add a couple lines about your cases 




**Test Case Design for Gift Card Functionality**
There are several different types of gift cards available on amazon.ca and also several options of actions that can be completed related to gift cards. The following is a summary of the test cases created for this functionality and the design process. All test cases were automated using Selenium with verification and assertion check points added to the scripts. 

1. gift_card_testGiftCardOptions  
This test case was designed to confirm the options available related to gift card functionality - including Amazon Gift Cards, Specialty Gift Cards, Redeem Amazon gift card, View your balance, and Amazon Reload. This test involves navigating to the Gift Card page through the main hamburger menu on the top left banner, with verifications along the way to confirm that the hamburger menu is present, and gift card is an option within the menu prior to clicking it. After navigating to the gift card page, this test includes assertions to confirm the presence of each of the options mentioned above that can be clicked by the customer depending on what they need to do related to gift cards. 

2. gift_card_testShopByAmazonEGiftCard
This test case was designed to try shopping for gift cards based on specific selection criteria. The test data for this test case is an Amazon EGift Card, therefore it involves going through the same initial steps as first test to confirm the customer can navigate to the gift card page and that the Amazon Gift Card option is present. Then within the Amazon Gift Card Option, this test asserts the presence of the eGift Card option, which brings the customer to the page showing all eGift cards. 

3. gift_card_testShopByAmazonPhysicalGiftCard
This test case was also designed to try shopping for gift cards based on specific selection criteria. The test data for this test case is an Amazon Physical Card, therefore it involves going through the same initial steps as first test to confirm the customer can navigate to the gift card page and that the Amazon Gift Card option is present. Then within the Amazon Gift Card Option, this test asserts the presence of the Physical Card option, which brings the customer to the page showing all Physical cards. 

4. gift_card_testShopByOccasionBirthday 
This test case was also designed to try shopping for gift cards based on specific selection criteria. The test data for this test case is a Birthday Amazon Gift Card, therefore it involves going through the same initial steps as first test to confirm the customer can navigate to the gift card page and that the Amazon Gift Card option is present. Then the test verifies that the Shop By Occasion section is present on the page for Amazon Gift Cards. Then within the Shop By Occassion section, this test asserts the presence of the Birthday option, which brings the customer to the page showing all Birthday cards. 

5. gift_card_test_ShopByOccasionCongratulations  
This test case was also designed to try shopping for gift cards based on specific selection criteria. The test data for this test case is a Congratulations Amazon Gift Card, therefore it involves going through the same initial steps as first test to confirm the customer can navigate to the gift card page and that the Amazon Gift Card option is present. Then the test verifies that the Shop By Occasion section is present on the page for Amazon Gift Cards. Then within the Shop By Occassion section, this test asserts the presence of the Congratulations option, which brings the customer to the page showing all Birthday cards. 

6. gift_card_test_ShopBySpecialtyGiftCardByBrandApple 
This test case was also designed to try shopping for gift cards based on specific selection criteria. The test data for this test case is a Specialty Gift Card for the Apple brand, therefore it involves going through the same initial steps as first test to confirm the customer can navigate to the gift card page and that the Specialty Gift Card option is present. Then the test verifies that the Top Brands section is present on the page for Specialty Gift Cards. Then within the Top Brands section, this test asserts the presence of the Apple option, which brings the customer to the page showing all Apple cards. 

**Test Case Design for Gift Ideas Functionality**  
The gift ideas functionality on amazon.ca provides an option to search for gift ideas by filtering based on the characteristics of who the gift is meant to be for. It's possible to search based on gender and age ranges. The following is a summary of the test cases created for this functionality and the design process. All test cases were automated using Selenium with verification and assertion check points added to the scripts. 

1. gift_ideas_testGiftIdeasOptions  
This test case was designed to confirm the options available related to gift ideas functionality - including Gift Cards, Women, Men, Teens, Kids 8-12, Kids 4-7 and Babies. The test involves navigating to the gift ideas page using the option on the main banner, verifying it is present prior to selecting it, and then also verifying the presence of the "Who are you shopping for" text at the top of the gift ideas page. The test then asserts the presence of each of the options listed above for searching for gift ideas. 

2. gift_ideas_testGiftIdeasforMenHomeAndGarden  
This test case was designed to try shopping for gift ideas based on specific selection criteria. The test data for this test case is men and the home and garden category. Therefore, it involves going through the same initial steps to first confirm the customer can navigate to the gift ideas page, and verifying the presence of the men selection on the page. The test verifies that the text at the top of the page reads "Gifts for Men" after selecting men, and then asserts the presence of the Home & Garden option within the gifts for men. 

3. gift_ideas_testGiftIdeasforWomenTravel  
This test case was designed to try shopping for gift ideas based on specific selection criteria. The test data for this test case is women and the travel category. Therefore, it involves going through the same initial steps to first confirm the customer can navigate to the gift ideas page, and verifying the presence of the women selection on the page. The test verifies that the text at the top of the page reads "Gifts for Women" after selecting women, and then asserts the presence of the travel option within the gifts for women. 

4. gift_ideas_testGiftIdeasChangeAgeSelection  
This test case was designed to try changing the age selection after making an initial selection on the gifts page. The test data for this test case is women and girls 8-12. This test involves going through the same initial steps to first confirm the customer can navigate to the gift ideas page, the women selection on the page is present, and the text "Gifts for Women" appears on the page. Then this test verifies the presence of the Age Group menu, and verifies the presence of the age range 8-12 on this menu. After changing the age range to 8-12, the test asserts that the newly loaded page lists "Gifts for Girls 8-12" at the top. 

5. gift_ideas_testGiftIdeasChangeGenderSelection 
This test case was designed to try changing the gender selection after making an initial selection on the gifts page. The test data for this test case is women and anyone. This test involves going through the same initial steps to first confirm the customer can navigate to the gift ideas page, the women selection on the page is present, and the text "Gifts for Women" appears on the page. Then this test verifies the presence of the Gender menu, and verifies the presence of Anyone on this menu. After changing the gender to Anyone, the test asserts that the newly loaded page lists "Gifts for Everyone" at the top. 


# Explain the use of assertions and checkpoints
Austen to fill in 

# how did you test each functionaity with different test data
Steven to fill in, Austen to add some 

# How the team work/effort was divided and managed
Before starting the assignment, the team met to outline a plan for the required steps. Each team member completed the relevant setup required, such as cloning the github page, importing the Eclipse project, and installing Pitest for mutation testing, and downloading the required browser and installing extensions required for the GUI testing. 

For the mutation testing portion of the assignment, the work was divided among the team members based on their previous work with the DataUtilities and Range methods in Assignments 2 and 3. This was done so that addition of test cases to increase mutation scores could be more efficient based on familiarity with the class methods from previous assignments. Steven Au and Laurel Flanagan reviewed the initial mutation testing scores for the Range class, and took turns adding additional test cases to increase the mutation score. Steven and Laurel each completed analysis for 5 mutants for the Range class for the relevant report section. Rhys Wickens and Austen Zhang reviewed the initial mutation testing scores for the DataUtilities class, and took turns adding additional test cases to increase the mutation score. Reviews of the other testers test cases were completed within the pairs for quality checks. 

For the GUI testing, each team member designed test cases for 2 functionalities of the amazon.ca website as per the assignment instructions. The functionalities tested and the tester responsible are listed below. 

| Functionality                  | Tester          |
|---------------------------------|-----------------|
| Product Search                  | Rhys Wickens    |
| Shopping Cart                   | Rhys Wickens    |
| Gift Card                       | Laurel Flanagan |
| Gift Ideas                      | Laurel Flanagan |
| Sort Products by Price          | Austen Zhang    |
| Filter Products                 | Austen Zhang    |
| Login                           | Steven Au       |
| Account Creation                | Steven Au       |

The team reviewed the tests together, with each team member running all GUI tests on their own system and browser to identify discrepancies between results. This is also discussed further in the other sections.
The report was divided amongst the team members equally, with each member adding their relevant contributions to the appropriate sections.  

# Difficulties encountered, challenges overcome, and lessons learned
Rhys to fill in 

- difficulties with GUI testing with different machines and browsers and website appears differently sometimes, difficulty with login stuff 
- mutation testing - identifying why a mutant was killed or not killed 

# Comments/feedback on the assignment itself

Rhys to fill in 
