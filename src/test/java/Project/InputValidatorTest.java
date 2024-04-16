package Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.InputValidator;

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
}
