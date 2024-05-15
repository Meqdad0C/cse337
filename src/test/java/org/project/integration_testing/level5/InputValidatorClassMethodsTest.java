package org.project.integration_testing.level5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.InputValidator;

import static org.junit.jupiter.api.Assertions.*;


public class InputValidatorClassMethodsTest {
    /*          isFullMarkValid          */
    //doesn't need integration testing as it is leaf node tested via unit testing



    /*          isFinalExamMarkValid          */
    @Test
    void isFinalExamMarkValid_validMark_inRange(){
        InputValidator in_validator = new InputValidator();
        int input = 10;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_validMark_maxValue(){
        InputValidator in_validator = new InputValidator();
        int input = 60;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_validMark_minValue(){
        InputValidator in_validator = new InputValidator();
        int input = 0;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_smallerValueByOne(){
        InputValidator in_validator = new InputValidator();
        int input = -1;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_greaterValueByOne(){
        InputValidator in_validator = new InputValidator();
        int input = 61;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_biggerValueThanMax(){
        InputValidator in_validator = new InputValidator();
        int input = 100;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_smallerValue(){
        InputValidator in_validator = new InputValidator();
        int input = -100;
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_stringExceptionTesting_1(){
        InputValidator in_validator =new InputValidator();
        String input = "mo";
        boolean actual = in_validator.isFinalExamMarkValid(input);
        assertFalse(actual);
    }



    /*          isMidtermExamMarkValid          */
    @Test
    void isMidtermExamMarkValid_validMark_inRange(){
        InputValidator in_validator = new InputValidator();
        int input = 10;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_maxValue(){
        InputValidator in_validator = new InputValidator();
        int input = 20;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_minValue(){
        InputValidator in_validator = new InputValidator();
        int input = 0;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_smallerValueByOne(){
        InputValidator in_validator = new InputValidator();
        int input = -1;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_greaterValueByOne(){
        InputValidator in_validator = new InputValidator();
        int input = 21;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_biggerValue(){
        InputValidator in_validator = new InputValidator();
        int input = 100;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_smallerValue(){
        InputValidator in_validator = new InputValidator();
        int input = -100;
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_stringExceptionTesting_1(){
        InputValidator in_validator =new InputValidator();
        String input = "mo";
        boolean actual = in_validator.isMidtermExamMarkValid(input);
        assertFalse(actual);
    }

    /*          isOralPracticalMarkValid          */
    @Test
    void isOralPracticalMarkValid_InvalidMark_negativeBigNumber_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = -50;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_negativeNumberBoundary_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = -1;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_positiveBigNumber_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 100;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_positiveNumberBoundary_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 11;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_Zero_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 0;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_MaxVal_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 10;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_inRange_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 3;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_invalidMark_exceptionTesting() {
        InputValidator in_validator = new InputValidator();
        String input = "Megz";
        boolean actual = in_validator.isOralPracticalMarkValid(input);
        assertFalse(actual);
    }

    //extra test cases but not needed for integration
    @Test
    void isOralPracticalMarkValid_InvalidMark_negativeBigNumber() {
        InputValidator in_validator = new InputValidator();
        int input = -50;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_negativeNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        int input = -1;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_positiveBigNumber() {
        InputValidator in_validator = new InputValidator();
        int input = 100;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_positiveNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        int input = 11;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_Zero() {
        InputValidator in_validator = new InputValidator();
        int input = 0;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_MaxVal() {
        InputValidator in_validator = new InputValidator();
        int input = 10;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_inRange() {
        InputValidator in_validator = new InputValidator();
        int input = 5;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    

    /*          isStudentActivitiesMarkValid          */
    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeBigNumber_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = -50;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeNumberBoundary_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = -1;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveBigNumber_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 100;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveNumberBoundary_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 11;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_Zero_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 0;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_MaxVal_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 10;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_inRange_NoMock() {
        InputValidator in_validator = new InputValidator();
        int input = 3;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_invalidMark_exceptionTesting() {
        InputValidator in_validator = new InputValidator();
        String input = "Megz";
        boolean actual = in_validator.isStudentActivitiesMarkValid(input);
        assertFalse(actual);
    }
    //extra test cases but not needed for integration
    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeBigNumber() {
        InputValidator in_validator = new InputValidator();
        int input = -50;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        int input = -1;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveBigNumber() {
        InputValidator in_validator = new InputValidator();
        int input = 100;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        int input = 11;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_Zero() {
        InputValidator in_validator = new InputValidator();
        int input = 0;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_MaxVal() {
        InputValidator in_validator = new InputValidator();
        int input = 10;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_inRange() {
        InputValidator in_validator = new InputValidator();
        int input = 5;
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }



    /*          isStudentNumberValid          */
    @Test
    public void isStudentNumberValid_test_caseValidStudentNumberWithDigit() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNumberValid("12345678"));
    }

    @Test
    public void isStudentNumberValid_test_caseValidStudentNumberWithLetter() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNumberValid("1234567A"));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberShort() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid("1234567"));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberLong() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid("123456789"));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberWithNonAlphanumeric() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid("1234567*"));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberWithLettersInMiddle() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid("1234A678"));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberAllLetters() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid("ABCDEFGH"));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberEmpty() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid(""));
    }

    @Test
    public void isStudentNumberValid_test_caseInvalidStudentNumberNull() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNumberValid(null));
    }



    /*          isStudentNameValid          */
    @Test
    public void isStudentNameValid_test_validNameWithAlphabetsOnly() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNameValid("Abdalla"));
    }

    @Test
    public void isStudentNameValid_test_validNameWithAlphabetsAndSpaces() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNameValid("Abdalla Ibrahim"));
    }

    @Test
    public void isStudentNameValid_test_nameStartsWithSpace() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNameValid(" Abdalla Ibrahim"));
    }

    @Test
    public void isStudentNameValid_test_nameContainsNumbers() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNameValid("Abdalla123"));
    }

    @Test
    public void isStudentNameValid_test_nameContainsSpecialCharacters() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNameValid("Abdalla-Ibrahim"));
    }

    @Test
    public void isStudentNameValid_test_emptyName() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNameValid(""));
    }

    @Test
    public void isStudentNameValid_test_nullName() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNameValid(null));
    }

    @Test
    public void isStudentNameValid_test_singleCharacterName() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNameValid("A"));
    }

    @Test
    public void isStudentNameValid_test_nameWithSpacesBetween() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNameValid("Abdalla Ibrahim Abdalla"));
    }

    @Test
    public void isStudentNameValid_test_nameWithLongValidName() {
        InputValidator in_validator = new InputValidator();
        assertTrue(in_validator.isStudentNameValid("John Jacob Jingleheimer Schmidt"));
    }



    /*          isSubjectCodeValid          */
    @Test
    void isSubjectCodeValid_validCode_UpperCase_without_s() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE337");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_validCode_LowerCase_with_s() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("cse337s");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Capital_S() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE337S");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Substitute_s() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE337o");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_1MoreChar() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSEC337");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_1MoreNumber() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE3375");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_lessNumber() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE33s");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_lessChar() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("EC225s");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_SpecialChar_withAlphabetic() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("EC$225");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_SpecialChar_withNumbers() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("ECE22$");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Substitute_chars_with_numbers() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("990cse");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OnlyChars() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSEs");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OnlyNums() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("254");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_StartSpace() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid(" CSE450");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_MiddleSpace() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE 450");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_EndSpace() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("CSE450 ");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OneChar() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("s");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OneNum() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("5");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_moreThan7() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectCodeValid("EMP462sIce");
        assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }



    /*          isSubjectNameValid          */
    @Test
    void isSubjectNameValid_validSubject_OneWord() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Java");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_TwoWords() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_ManyWords() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Professional Ethics and Legislations");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_SpaceEnd() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Professional Ethics and Legislations ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_ManySpaces() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Professional     Ethics    and      Legislations      ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_OneChar() {
        boolean expected = true;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("S");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_OneNum() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("2");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_SpaceStart() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid(" Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_onlySpaces() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("    ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberStart() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("2Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberMiddle() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Software250Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberEnd() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Software Testing10");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterStart() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("$oftware Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterMiddle1() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Software_Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterMiddle2() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Professional Ethics @nd Legislations ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterEnd() {
        boolean expected = false;
        InputValidator in_validator = new InputValidator();
        boolean actual = in_validator.isSubjectNameValid("Professional Ethics and Legislations! ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }


}
