package org.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InputValidator {
    /**
     * 1. Subject name: It must be Alphabetic characters and Spaces. the name should not start with space
     */
    public boolean isSubjectNameValid(String subjectName) {
        String regex = "^[a-zA-Z][a-zA-Z ]*$";
        return InputValidator.validate_regex(regex, subjectName);
    }

    /**
     * 2. Subject-code: It must be 6-7 Alphanumeric characters. The first 3 are Alphabetic followed by 3 numeric characters. The sevens should be s if exists.
     */
    public boolean isSubjectCodeValid(String subjectCode) {
        String regex = "^[a-zA-Z]{3}[0-9]{3}s?$";
        return InputValidator.validate_regex(regex, subjectCode);
    }

    /**
     * 3. Full mark: It is a numeric number of the value: 100
     */
    public boolean isFullMarkValid(String fullMark) {
        return fullMark.equals("100");
    }

    /**
     * 4. Student name: It must be Alphabetic characters and Spaces. the name should not start with space.
     */
    public boolean isStudentNameValid(String studentName) {
        if (studentName == null) {
            return false;
        }
        String regex = "^[a-zA-Z][a-zA-Z ]*$";
        return InputValidator.validate_regex(regex, studentName);
    }

    /**
     * 5. Student number: the length of this field must be Alphanumeric characters of exact
     * length of 8 characters. It should start with numbers and might End with only one Alphabetic character
     */
    public boolean isStudentNumberValid(String studentNumber) {
        if (studentNumber == null) {
            return false;
        }
        String regex = "^\\d{7}([A-Za-z]|\\d)$";
        return InputValidator.validate_regex(regex, studentNumber);
    }

    /**
     * 6. Student Activities mark: It is an integer of a value from 0 up to 10 of the full mark
     */
    public boolean isStudentActivitiesMarkValid(String studentActivitiesMark) {
        try {
            int mark = Integer.parseInt(studentActivitiesMark);

            return validate_range(0, 10, mark);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 7. Oral/Practical mark: It is an integer of a value from 0 up to 10 of the full mark
     */
    public boolean isOralPracticalMarkValid(String oralPracticalMark) {
        try {
            int mark = Integer.parseInt(oralPracticalMark);
            return validate_range(0, 10, mark);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 8. Midterm exam mark: It is an integer of a value from 0 up to 20 of the full mark
     */

    public boolean isMidtermExamMarkValid(String midtermExamMark) {
        try {
            int mark = Integer.parseInt(midtermExamMark);
            return validate_range(0, 20, mark);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 9. Final exam mark: It is an integer of a value from 0 up to 60 of the full mark
     */

    public boolean isFinalExamMarkValid(String finalExamMark) {
        try {
            int mark = Integer.parseInt(finalExamMark);
            return validate_range(0, 60, mark);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validateStudent(String name, String id, String activity_mark, String oral_mark, String midterm_mark, String final_mark) throws IllegalArgumentException {
        if (!isStudentNameValid(name)) {
            throw new IllegalArgumentException("Invalid student name got " + name + " expected alphabetic characters and spaces");
        }
        if (!isStudentNumberValid(id)) {
            throw new IllegalArgumentException("Invalid student number got " + id + " expected 8 characters must start with numbers and might end with only one alphabetic character");
        }
        if (!isStudentActivitiesMarkValid(activity_mark)) {
            throw new IllegalArgumentException("Invalid student activities mark got " + activity_mark + " expected 0-10");
        }
        if (!isOralPracticalMarkValid(oral_mark)) {
            throw new IllegalArgumentException("Invalid oral/practical mark got " + oral_mark + " expected 0-10");
        }
        if (!isMidtermExamMarkValid(midterm_mark)) {
            throw new IllegalArgumentException("Invalid midterm exam mark got " + midterm_mark + " expected 0-20");
        }
        if (!isFinalExamMarkValid(final_mark)) {
            throw new IllegalArgumentException("Invalid final exam mark got " + final_mark + " expected 0-60");
        }
        return true;
    }

    public  boolean validateSubject(String name, String code, String fullMark) throws IllegalArgumentException {
        if (!isSubjectNameValid(name)) {
            throw new IllegalArgumentException("Invalid subject name got " + name + " expected alphabetic characters and spaces");
        }
        if (!isSubjectCodeValid(code)) {
            throw new IllegalArgumentException("Invalid subject code got " + code + " expected 6-7 Alphanumeric characters with the first 3 are Alphabetic followed by 3 numeric characters. The sevens should be s if exists");
        }
        if (!isFullMarkValid(fullMark)) {
            throw new IllegalArgumentException("Invalid full mark got " + fullMark + " expected 100");
        }
        return true;
    }


    private static boolean validate_regex(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public  boolean validate_range(int min, int max, int input) {
        return input >= min && input <= max;
    }
}
