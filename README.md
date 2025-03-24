## SENG637 Assignment 4
| Group \#:      |   11  |
| -------------- | --- |
| Student Names: |     |
|Steven Au       |     |
|Laurel Flanagan |     |
|Rhys Wickens    |     |
|Austen Zhang    |     |

# Instructions for 2_mutation_testing

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

# Instructions for 3_GUI_testing

## Running the Selenium IDE Test

Follow these steps to set up and run the Selenium test suite in Firefox:

### Prerequisites
- Ensure you have **Firefox** installed on your computer. If not, download it here:
  - [Download Firefox](http://www.mozilla.org/en-US/firefox/new)

- Install **Selenium IDE**:
  1. Open Firefox and navigate to the Selenium IDE extension page:
     - [Selenium IDE Add-on](https://addons.mozilla.org/en-US/firefox/addon/selenium-ide/)
  2. Click **"Add to Firefox"** and wait for the download to complete.
  3. Click **"Add"** to install the extension.
  4. Once installed, click on the **Selenium IDE** icon in the Firefox extensions to open it.

### Running the Tests
1. **Clone this GitHub repository** or download the `ENSF_637_A4_GUI_Testing.side` file to your local computer.
   
   - To clone the repository using Git:
     ```sh
     git clone <repository_url>
     cd <repository_folder>
     ```

2. **Open Selenium IDE** in Firefox.

3. Click **"Open Project"** and navigate to the location where you saved the `ENSF_637_A4_GUI_Testing.side` file.

4. You should now see all the recorded tests loaded in Selenium IDE.

5. **Run the tests:**
   - Click **"Run all tests"** to execute the entire test suite.
   - Alternatively, select individual tests and run them one by one.

### Notes
- Ensure you have a **stable internet connection** since the test runs on [Amazon.ca](https://www.amazon.ca/).
- If a test fails, check for **UI changes** on Amazon's website, as elements may have been updated.



