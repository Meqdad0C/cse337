package Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.InputValidator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MongedInputTest {
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

}