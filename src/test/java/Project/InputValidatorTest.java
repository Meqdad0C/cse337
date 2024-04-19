package Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.InputValidator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class InputValidatorTest {

    /*                              isSubjectNameValid Method Testing                         */
    @Test
    void isSubjectNameValid_validSubject_OneWord(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectNameValid("Java");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_TwoWords(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectNameValid("Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_ManyWords(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectNameValid("Professional Ethics and Legislations");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_SpaceEnd(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectNameValid("Professional Ethics and Legislations ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_ManySpaces(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectNameValid("Professional     Ethics    and      Legislations      ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_validSubject_OneChar(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectNameValid("S");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_OneNum(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("2");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_SpaceStart(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid(" Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_onlySpaces(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("    ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberStart(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("2Software Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberMiddle(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("Software250Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_numberEnd(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("Software Testing10");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterStart(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("$oftware Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterMiddle1(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("Software_Testing");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterMiddle2(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("Professional Ethics @nd Legislations ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    @Test
    void isSubjectNameValid_InvalidSubject_specialCharacterEnd(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectNameValid("Professional Ethics and Legislations! ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectNameValid method");
    }

    /*                              isSubjectCodeValid Method Testing                         */

    @Test
    void isSubjectCodeValid_validCode_UpperCase_without_s(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectCodeValid("CSE337");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_validCode_LowerCase_with_s(){
        boolean expected = true;
        boolean actual = InputValidator.isSubjectCodeValid("cse337s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Capital_S(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSE337S");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Substitute_s(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSE337o");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_1MoreChar(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSEC337");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_1MoreNumber(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSE3375");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_lessNumber(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSE33s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_lessChar(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("EC225s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_SpecialChar_withAlphabetic(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("EC$225");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_SpecialChar_withNumbers(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("ECE22$");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_Substitute_chars_with_numbers(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("990cse");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OnlyChars(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSEs");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OnlyNums(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("254");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_StartSpace(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid(" CSE450");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_MiddleSpace(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSE 450");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_EndSpace(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("CSE450 ");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OneChar(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("s");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_OneNum(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("5");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    void isSubjectCodeValid_InvalidCode_moreThan7(){
        boolean expected = false;
        boolean actual = InputValidator.isSubjectCodeValid("EMP462sIce");
        Assertions.assertEquals(expected, actual, "Error in isSubjectCodeValid method");
    }

    @Test
    public void testValidSubjectName() {
        assertTrue(InputValidator.validateSubject("Mathematics Advanced", "ABC123", "100"));
    }

    @Test
    public void testSubjectNameStartsWithSpace() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.validateSubject(" Mathematics", "ABC123", "100"));
    }

    @Test
    public void testSubjectNameWithNonAlphabeticCharacters() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.validateSubject("Math123", "ABC123", "100"));
    }

    @Test
    public void testEmptySubjectName() {
        assertThrows(IllegalArgumentException.class, () ->
            InputValidator.validateSubject("", "ABC123", "100"));
    }

    @Test
    public void testValidSubjectCode6Chars() {
        assertTrue(InputValidator.validateSubject("Physics", "XYZ789", "100"));
    }

    @Test
    public void testValidSubjectCode7Chars() {
        assertTrue(InputValidator.validateSubject("Biology", "XYZ789s", "100"));
    }

    @Test
    public void testSubjectCodeTooShort() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.validateSubject("Chemistry", "XYZ78", "100"));
    }

    @Test
    public void testSubjectCodeTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            InputValidator.validateSubject("Chemistry", "XYZ12345", "100"));
    }

    @Test
    public void testSubjectCodeInvalidCharacters() {
        assertThrows(IllegalArgumentException.class, () ->
            InputValidator.validateSubject("Chemistry", "XY3123", "100"));
    }

    @Test
    public void testSubjectCodeInvalidNumericPart() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.validateSubject("Chemistry", "XYZ12s", "100"));
    }

    @Test
    public void testValidFullMark() {
        assertTrue(InputValidator.validateSubject("History", "XYZ123", "100"));
    }

    @Test
    public void testInvalidFullMarkNumeric() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.validateSubject("History", "XYZ123", "90"));
    }

    @Test
    public void testInvalidFullMarkNonNumeric() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.validateSubject("History", "XYZ123", "One hundred"));
    }



    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeBigNumber(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = -50;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeNumberBoundary(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = -1;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveBigNumber(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 100;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveNumberBoundary(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 11;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_Zero(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 0;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_MaxVal(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 10;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_inRange(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 5;
//        PowerMockito.mockSta
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(input>=min && input <=max );
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeBigNumber_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = -50;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_negativeNumberBoundary_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = -1;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveBigNumber_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 100;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_InvalidMark_positiveNumberBoundary_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 11;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_Zero_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 0;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_MaxVal_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 10;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_inRange_NoMock(){
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =10;
        int input = 3;
//        PowerMockito.mockSta
        boolean actual = in_validator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

}
