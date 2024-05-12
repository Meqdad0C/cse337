package org.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class BoundaryAnalysisTest {
    @Test
    void isStudentActivitiesMarkValid_validMark_positiveNumberBoundary() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 9;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isStudentActivitiesMarkValid_ValidMark_positiveNumberBoundary2() {
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min = 0;
        int max = 10;
        int input = 1;
        when(spyValidator.validate_range(min, max, input)).thenReturn(input >= min && input <= max);
        boolean actual = spyValidator.isStudentActivitiesMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_positiveBoundary() {
        InputValidator in_validator = new InputValidator();
        int input = 1;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isOralPracticalMarkValid_ValidMark_positiveBoundary2() {
        InputValidator in_validator = new InputValidator();
        int input = 9;
        boolean actual = in_validator.isOralPracticalMarkValid(String.valueOf(input));
        assertTrue(actual);
    }
    @Test
    void isMidtermExamMarkValid_validMark_boundaryValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 19;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    @Test
    void isMidtermExamMarkValid_validMark_boundaryValue2(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =20;
        int input = 1;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isMidtermExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }
    @Test
    void isFinalExamMarkValid_validMark_maxValue(){
        InputValidator in_validator = new InputValidator();
        InputValidator spyValidator = spy(in_validator);
        int min =0;
        int max =60;
        int input = 1;
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
        int input = 59;
        when(spyValidator.validate_range(min,max,input)).thenReturn(true );
        boolean actual = spyValidator.isFinalExamMarkValid(String.valueOf(input));
        assertTrue(actual);
    }

    //////////////////////GPA helper class//////////////////
    @Test
    void getGradeTest_D_Boundary() {
        String actual = GpaHelper.getGrade(61);
        String expected = "D";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_D_PLUS_Boundary() {
        String actual = GpaHelper.getGrade(65);
        String expected = "D+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_C_MINUS_Boundary() {
        String actual = GpaHelper.getGrade(68);
        String expected = "C-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_C_Boundary() {
        String actual = GpaHelper.getGrade(71);
        String expected = "C";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_C_PLUS_Boundary() {
        String actual = GpaHelper.getGrade(71);
        String expected = "C";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_B_MINUS_Boundary() {
        String actual = GpaHelper.getGrade(77);
        String expected = "B-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_B_Boundary() {
        String actual = GpaHelper.getGrade(81);
        String expected = "B";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_B_PLUS_Boundary() {
        String actual = GpaHelper.getGrade(85);
        String expected = "B+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_A_MINUS_Boundary() {
        String actual = GpaHelper.getGrade(90);
        String expected = "A-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_A_Boundary() {
        String actual = GpaHelper.getGrade(94);
        String expected = "A";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }
    @Test
    void getGradeTest_A_PLUS_Boundary() {
        String actual = GpaHelper.getGrade(98);
        String expected = "A+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    public void isStudentNameValid_test_nameNumbersOnly() {
        InputValidator in_validator = new InputValidator();
        assertFalse(in_validator.isStudentNameValid("2"));
    }

}
