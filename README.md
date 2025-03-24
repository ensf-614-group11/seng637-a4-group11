## SENG637 Assignment 4
| Group \#:      |   11  |
| -------------- | --- |
| Student Names: |     |
|Steven Au       |     |
|Laurel Flanagan |     |
|Rhys Wickens    |     |
|Austen Zhang    |     |

# Instruction for 2_mutation_testing

## Test Suites for JFreeChart
### - `org.jfree.data.RangeTest`
### - `org.jfree.data.DataUtilitiesTest`

# System Requirements
- **Java SE Development Kit (JDK)**: JavaSE-1.8
- **Eclipse IDE**: Eclipse IDE for Java Developers (2023-12 or later recommended).
- **JUnit**: Version 4.11 (compatible with Java SE 8, included in the project's `lib` folder).
- **JMock**: Version 2.5.1 (compatible with JUnit 4.11, included in the project's `lib` folder).
- **JFreeChart**: Version 1.0.19 (included in the project's `lib` folder).

# Setup Instructions

1. **Clone the Repository:**
```bash
   git clone https://github.com/ensf-614-group11/seng637-a4-group11.git
```

2. **Import the Project into Eclipse:**
   - Open Eclipse.
   - Go to **File** → **Import** → **General** → **Existing Projects into Workspace**.
   - Select the project folder located at `<your import location>\seng637-a4-group11\JFreeChart_Lab3` and click **Finish**.

3. **Verify Dependencies:**
   - Ensure the `lib` folder (containing all JAR files) is correctly referenced in the project.

4. **Run the Tests:**
   - Navigate to the test classes in the Project Directory, located at `src\org.jfree.data`.
   - Right-click on the test class → **Run As** → **JUnit Test**.
   - The directory contains the following test classes:
     - `org.jfree.data.RangeTest`
     - `org.jfree.data.DataUtilitiesTest`

# Troubleshooting
   - If any issues occur, manually add the JARs:
     - Right-click the project → **Build Path** → **Configure Build Path** → **Libraries** → **Add JARs**.
     - Select the JARs from the `lib` folder and click **OK**.
     - Verify that the JAR files in the `lib` folder match the ones listed in the `.classpath` file.
- The `.classpath` file uses relative paths to the `lib` folder, which are used by eclipse to build the project dependencies. Ensure the `lib` folder is present in the project directory.
