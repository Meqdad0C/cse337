# CSE337 Project 1 - Student Grading System

## Implementation Details

### Classes

- `Student` - Represents a student with a name, id, GPA, grade.
- `Subject` - Represents a subject with a name, code, and max mark.
- `GpaHelper` - Helper class to calculate GPA and grade.
- `InputValidator` - validates all inputs.inpu
- `InputParser` - parses input String to Student and Subject objects.
- `OutputWriter` - writes output to a String.
- `Main` - Main class to run the program.

## How to run

- Check if you have Java 21 and Gradle 8.6 installed.
- Using intelliJ IDEA, open the project and run the `Main` class, modify arguments in the run configuration. **<input-file> and <output-file> are required.**
- `src/main/resources/sw-testing.csv src/main/resources/MEGZOUT22.csv`
- Using terminal, navigate to the project directory and run the following commands:
  - `gradle build`
  - `java -jar ./build/libs/SWTesting-1.0-SNAPSHOT.jar <input-file> <output-file>`