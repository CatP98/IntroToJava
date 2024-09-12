# Intro to Java Exercises
This repository contains a series of introductory Java exercises designed to help users get acquainted with Java syntax, its capabilities as both a compiled and interpreted language, and its statically typed nature. The exercises cover fundamental Java programming concepts, including string manipulation, regular expressions, array handling, loops, and conditional statements.


## Languages:
- **Java**

## Frameworks:
- **None (for this assignment)**

## Tools:
- **Vim**: For creating and editing `.java` files.
- **JDK**: To compile and execute Java programs.
- **Git**: For version control and collaboration.

## Table of Contents
- [Project Description](#project-description)
- [Exercises](#exercises)
- [How to Run the Exercises](#how-to-run-the-exercises)
- [Future Improvements](#future-improvements)

## Project Description
The project consists of five separate exercises, each implemented in its own Java file. These exercises aim to solidify your understanding of basic Java programming concepts and prepare you for more advanced topics.

### Key Concepts Covered:
- Array declaration and manipulation
- String manipulation and regular expressions
- Conditional statements and loops
- Methods from the Math class
- Basic input/output operations

## Exercises

### Exercise 1: String Manipulation
**File:** `StringManipulation.java`

Task: Extract and manipulate parts of a string to print a formatted message using given data.


### Exercise 2: Regex Manipulation
**File:** RegexReplacer.java

Task: Replace all vowels in a string with the character #.

Input: Peter Piper picked a peck of pickled peppers.
Output: P#t#r P#p#r p#ck#d # p#ck #f p#ckl#d p#pp#rs.


### Exercise 3: Leap Year Verifier
**File:** LeapYearVerifier.java

Task: Verify if the given years are leap years.

int[] years = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 1900, 2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000};


### Exercise 4: Closest Neighbours
**File:**  ClosestNeighbours.java

Task: Find and print two neighboring numbers in an array with the smallest difference.

int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};

### Exercise 5: Anagram Checker
**File:** AnagramChecker.java

Task: Check if two strings are anagrams of each other.

String[][] anagrams = {
    {"astronomer", "moon starer"},
    {"listen", "silent"},
    {"the Morse Code", "here come dots"},
    {"the eyes", "they see"},
    {"hello", "from the other side"},
    {"C a t a r i n a", "Aniratac"}
};


## How to Run the Exercises

1. **Clone the Repository:**
   Clone this repository to your local machine using Git:
   ```bash
   git clone <repository-url>

2. **Navigate to the Project Directory: Change directory to the project folder:**
        cd intro-to-java-exercises
   
    Compile the Java Files: Use the Java compiler to compile all the Java files in the project:
        javac *.java

3. **Run the Individual Programs: Execute each program using the java command.**
    For example:
        java StringManipulation
        java RegexReplacer
        java LeapYearVerifier
        java ClosestNeighbours
        java AnagramChecker

   Each program will print its results to the console. Make sure to run each Java class file individually to see the     output of each exercise.

   
### Future Improvements

```markdown
## Future Improvements

- **Enhanced Error Handling:**
  Add more robust error checking and exception handling to improve program reliability and user experience.

- **User Input Handling:**
  Modify programs to accept user input for dynamic functionality and more interactive testing.

- **GUI Development:**
  Implement graphical user interfaces (GUIs) for a more engaging and user-friendly experience.

- **Optimized Algorithms:**
  Refactor algorithms for efficiency and performance improvements, especially for larger datasets.

- **Extended Functionality:**
  Add more complex features and enhancements to each exercise, such as additional data processing or support for more varied inputs.

Feel free to contribute by addressing these areas or suggesting new improvements!


