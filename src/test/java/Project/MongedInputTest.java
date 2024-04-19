package Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.InputValidator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MongedInputTest {
    /*                              isFinalExamMarkValid Method Testing                         */
    @Test
    void isFinalExamMarkValid_validMark_inRange(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = 10;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_validMark_maxValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = 60;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_validMark_minValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = 0;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_smallerValueByOne(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = -1;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_greaterValueByOne(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = 61;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_biggerValueThanMax(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = 100;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isFinalExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isFinalExamMarkValid_invalidMark_smallerValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =60;
        int input = -100;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
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


    /*                              isMidtermExamMarkValid Method Testing                         */
    @Test
    void isMidtermExamMarkValid_validMark_inRange(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = 10;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_maxValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = 20;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_minValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = 0;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(true );
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_smallerValueByOne(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = -1;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_greaterValueByOne(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = 21;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_biggerValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = 100;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
        boolean actual = in_validator.isMidtermExamMarkValid(String.valueOf(input));
        assertFalse(actual);
    }

    @Test
    void isMidtermExamMarkValid_invalidMark_smallerValue(){
        InputValidator mockValidateRange = mock(InputValidator.class);
        InputValidator in_validator =new InputValidator();
        int min =0;
        int max =20;
        int input = -100;
        when(mockValidateRange.validate_range(min,max,input)).thenReturn(false );
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

}