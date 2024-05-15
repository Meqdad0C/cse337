package org.project.integration_testing.level4;

import org.junit.jupiter.api.Test;
import org.project.InputValidator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class InputValidatorClassMethodsTest {
    /*          validateSubject          */
    @Test
    public void testValidSubjectName() {
        InputValidator inputValidator = new InputValidator();
        assertTrue(inputValidator.validateSubject("Mathematics Advanced", "ABC123", "100"));
    }

    @Test
    public void testSubject_NameStartsWithSpace() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject(" Mathematics", "ABC123", "100"));
    }

    @Test
    public void testSubject_NameWithNonAlphabeticCharacters() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Math123", "ABC123", "100"));
    }

    @Test
    public void testEmptySubjectName() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("", "ABC123", "100"));
    }

    @Test
    public void test_ValidSubjectCode6Chars() {
        InputValidator inputValidator = new InputValidator();
        assertTrue(inputValidator.validateSubject("Physics", "XYZ789", "100"));
    }

    @Test
    public void test_ValidSubjectCode7Chars() {
        InputValidator inputValidator = new InputValidator();
        assertTrue(inputValidator.validateSubject("Biology", "XYZ789s", "100"));
    }

    @Test
    public void testSubjectCodeTooShort() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XYZ78", "100"));
    }

    @Test
    public void test_SubjectCodeTooLong() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XYZ12345", "100"));
    }

    @Test
    public void testSubjectCodeInvalidCharacters() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XY3123", "100"));
    }

    @Test
    public void testSubjectCodeInvalidNumericPart() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XYZ12s", "100"));
    }

    @Test
    public void test_ValidFullMark() {
        InputValidator inputValidator = new InputValidator();
        assertTrue(inputValidator.validateSubject("History", "XYZ123", "100"));
    }

    @Test
    public void testInvalidFullMarkNumeric() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("History", "XYZ123", "90"));
    }

    @Test
    public void test_InvalidFullMarkNonNumeric() {
        InputValidator inputValidator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("History", "XYZ123", "One hundred"));
    }




    /*          validateStudent         */
    @Test
    void validateStudent_test_validStudent() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.validateStudent("Meqdad Amr Shawky",
                "19016640",
                "10",
                "10", "20", "30"));

    }

    @Test
    void validateStudent_test_invalidStudentName_throwsException() {
        InputValidator in_validator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> in_validator.validateStudent("222",
                "19016640",
                "10",
                "10", "20", "30"));
    }

    @Test
    void validateStudent_test_invalidStudentNumber_throwsException() {
        InputValidator in_validator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> in_validator.validateStudent("Meqdad Amr Shawky",
                "1901664",
                "10",
                "10", "20", "30"));
    }

    @Test
    void validateStudent_test_invalidStudentActivitiesMark_throwsException() {
        InputValidator in_validator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> in_validator.validateStudent("Meqdad Amr Shawky",
                "19016640",
                "11",
                "10", "20", "30"));
    }

    @Test
    void validateStudent_test_invalidStudentOralPracticalMark_throwsException() {
        InputValidator in_validator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> in_validator.validateStudent("Meqdad Amr Shawky",
                "19016640",
                "10",
                "11", "20", "30"));
    }

    @Test
    void validateStudent_test_invalidStudentWrittenExamMark_throwsException() {
        InputValidator in_validator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> in_validator.validateStudent("Meqdad Amr Shawky",
                "19016640",
                "10",
                "10", "21", "30"));
    }

    @Test
    void validateStudent_test_invalidStudentFinalMark_throwsException() {
        InputValidator in_validator = new InputValidator();
        assertThrows(IllegalArgumentException.class, () -> in_validator.validateStudent("Meqdad Amr Shawky",
                "19016640",
                "10",
                "10", "20", "-1"));
    }

}
