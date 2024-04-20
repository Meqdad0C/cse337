package org.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class InputValidatorTest {

    static InputValidator inputValidator;

    @BeforeAll
    public static void setup() {
        inputValidator = new InputValidator();
    }


    /*                              isSubjectNameValid Method Testing                         */
    @Test
    void isSubjectNameValid_validSubject_OneWord() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectNameValid("Java");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_TwoWords() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectNameValid("Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_ManyWords() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectNameValid("Professional Ethics and Legislations");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_SpaceEnd() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectNameValid("Professional Ethics and Legislations ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_ManySpaces() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectNameValid("Professional     Ethics    and      Legislations      ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_OneChar() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectNameValid("S");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_OneNum() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("2");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_SpaceStart() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid(" Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_onlySpaces() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("    ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberStart() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("2Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberMiddle() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("Software250Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberEnd() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("Software Testing10");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterStart() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("$oftware Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterMiddle1() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("Software_Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterMiddle2() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("Professional Ethics @nd Legislations ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterEnd() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectNameValid("Professional Ethics and Legislations! ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    /*                              isSubjectCodeValid Method Testing                         */

    @Test
    void isSubjectCodeValid_validCode_UpperCase_without_s() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectCodeValid("CSE337");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_validCode_LowerCase_with_s() {
        boolean expected = true;
        boolean actual = inputValidator.isSubjectCodeValid("cse337s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Capital_S() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSE337S");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Substitute_s() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSE337o");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_1MoreChar() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSEC337");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_1MoreNumber() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSE3375");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_lessNumber() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSE33s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_lessChar() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("EC225s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_SpecialChar_withAlphabetic() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("EC$225");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_SpecialChar_withNumbers() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("ECE22$");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Substitute_chars_with_numbers() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("990cse");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OnlyChars() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSEs");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OnlyNums() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("254");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_StartSpace() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid(" CSE450");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_MiddleSpace() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSE 450");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_EndSpace() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("CSE450 ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OneChar() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OneNum() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("5");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_moreThan7() {
        boolean expected = false;
        boolean actual = inputValidator.isSubjectCodeValid("EMP462sIce");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    public void testValidSubjectName() {

        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Mathematics Advanced")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("ABC123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertTrue(inputValidator.validateSubject("Mathematics Advanced", "ABC123", "100"));

    }

    @Test
    public void testSubject_NameStartsWithSpace() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid(" Mathematics")).thenReturn(false);
        when(inputValidator.isSubjectCodeValid("ABC123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject(" Mathematics", "ABC123", "100"));
    }

    @Test
    public void testSubject_NameWithNonAlphabeticCharacters() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Math123")).thenReturn(false);
        when(inputValidator.isSubjectCodeValid("ABC123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Math123", "ABC123", "100"));
    }

    @Test
    public void testEmptySubjectName() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("")).thenReturn(false);
        when(inputValidator.isSubjectCodeValid("ABC123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("", "ABC123", "100"));
    }

    @Test
    public void test_ValidSubjectCode6Chars() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Physics")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ789")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertTrue(inputValidator.validateSubject("Physics", "XYZ789", "100"));
    }

    @Test
    public void test_ValidSubjectCode7Chars() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Biology")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ789s")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertTrue(inputValidator.validateSubject("Biology", "XYZ789s", "100"));
    }

    @Test
    public void testSubjectCodeTooShort() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Chemistry")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ78")).thenReturn(false);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XYZ78", "100"));
    }

    @Test
    public void test_SubjectCodeTooLong() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Chemistry")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ12345")).thenReturn(false);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XYZ12345", "100"));
    }

    @Test
    public void testSubjectCodeInvalidCharacters() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Chemistry")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XY3123")).thenReturn(false);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XY3123", "100"));
    }

    @Test
    public void testSubjectCodeInvalidNumericPart() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("Chemistry")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ12s")).thenReturn(false);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("Chemistry", "XYZ12s", "100"));
    }

    @Test
    public void test_ValidFullMark() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("History")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("100")).thenReturn(true);
        assertTrue(inputValidator.validateSubject("History", "XYZ123", "100"));
    }

    @Test
    public void testInvalidFullMarkNumeric() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("History")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("90")).thenReturn(false);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("History", "XYZ123", "90"));
    }

    @Test
    public void test_InvalidFullMarkNonNumeric() {
        InputValidator inputValidator = spy(InputValidator.class);

        when(inputValidator.isSubjectNameValid("History")).thenReturn(true);
        when(inputValidator.isSubjectCodeValid("XYZ123")).thenReturn(true);
        when(inputValidator.isFullMarkValid("One hundred")).thenReturn(false);
        assertThrows(IllegalArgumentException.class, () -> inputValidator.validateSubject("History", "XYZ123", "One hundred"));
    }


    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeBigNumber() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = -50;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = -1;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveBigNumber() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 100;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 11;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_Zero() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 0;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_MaxVal() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 10;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_inRange() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 5;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

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


    @Test
    void isOralPracticalMarkValid_InvalidMark_negativeBigNumber() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = -50;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_negativeNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = -1;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_positiveBigNumber() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 100;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_InvalidMark_positiveNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 11;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_Zero() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 0;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_MaxVal() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 10;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_inRange() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 5;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

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

    /*                              isFinalExamMarkValid Method Testing                         */
    @Test
    void isFinalExamMarkValid_validMark_inRange(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = 10;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_validMark_maxValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = 60;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_validMark_minValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = 0;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_smallerValueByOne(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = -1;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_greaterValueByOne(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = 61;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_biggerValueThanMax(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = 100;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_smallerValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = -100;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_stringExceptionTesting_1(){
        InputValidator in_validator =new InputValidator();
        String input = "mo";
        boolean actual = in_validator.isFinalExamMarkValid(input);
        assertFalse(actual);
    }


    /*                              isMidtermExamMarkValid Method Testing                         */
    @Test
    void isMidtermExamMarkValid_validMark_inRange(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 10;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_maxValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 20;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_minValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 0;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_smallerValueByOne(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = -1;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_greaterValueByOne(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 21;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_biggerValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 100;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_smallerValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = -100;
        when(spyValidator.validate_range(min,max,input)).thenReturn(false );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_stringExceptionTesting_1(){
        InputValidator in_validator =new InputValidator();
        String input = "mo";
        boolean actual = in_validator.isMidtermExamMarkValid(input);
        assertFalse(actual);
    }


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
