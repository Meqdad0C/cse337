package org.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GpaHelperTest {

    @Test
    void getGPATest_APlus(){
        double actual = GpaHelper.getGPA(Grade.A_PLUS);
        double expected = 4.0;
        Assertions.assertEquals(expected, actual, "Error in getgpa method");
    }

    @Test
    void getGPATest_A(){
        double actual = GpaHelper.getGPA(Grade.A);
        double expected = 4.0;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_AMinus(){
        double actual = GpaHelper.getGPA(Grade.A_MINUS);
        double expected = 3.7;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_BPlus(){
        double actual = GpaHelper.getGPA(Grade.B_PLUS);
        double expected = 3.3;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_B(){
        double actual = GpaHelper.getGPA(Grade.B);
        double expected = 3.0;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_BMinus(){
        double actual = GpaHelper.getGPA(Grade.B_MINUS);
        double expected = 2.7;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_CPlus(){
        double actual = GpaHelper.getGPA(Grade.C_PLUS);
        double expected = 2.3;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_C(){
        double actual = GpaHelper.getGPA(Grade.C);
        double expected = 2.0;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_CMinus(){
        double actual = GpaHelper.getGPA(Grade.C_MINUS);
        double expected = 1.7;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_DPlus(){
        double actual = GpaHelper.getGPA(Grade.D_PLUS);
        double expected = 1.3;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_D(){
        double actual = GpaHelper.getGPA(Grade.D);
        double expected = 1.0;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGPATest_F(){
        double actual = GpaHelper.getGPA(Grade.F);
        double expected = 0.0;
        Assertions.assertEquals(expected, actual,"Error in getgpa method");
    }

    @Test
    void getGradeTest_belowRange(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> GpaHelper.getGrade(-1));
        Assertions.assertEquals("Invalid total mark, it should be between 0 and 100", exception.getMessage());
    }

    @Test
    void getGradeTest_aboveRange(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> GpaHelper.getGrade(101));
        Assertions.assertEquals("Invalid total mark, it should be between 0 and 100", exception.getMessage());
    }

    @Test
    void getGradeTest_ZeroBoundary() {
        String actual = GpaHelper.getGrade(0);
        String expected = "F";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_F_Range() {
        String actual = GpaHelper.getGrade(59);
        String expected = "F";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_D_lowerBound() {
        String actual = GpaHelper.getGrade(60);
        String expected = "D";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_D_Range() {
        String actual = GpaHelper.getGrade(63);
        String expected = "D";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_DPlus_lowerBound() {
        String actual = GpaHelper.getGrade(64);
        String expected = "D+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_DPlus_Range() {
        String actual = GpaHelper.getGrade(66);
        String expected = "D+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_CMinus_lowerBound() {
        String actual = GpaHelper.getGrade(67);
        String expected = "C-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_CMinus_Range() {
        String actual = GpaHelper.getGrade(69);
        String expected = "C-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_C_lowerBound() {
        String actual = GpaHelper.getGrade(70);
        String expected = "C";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_C_Range() {
        String actual = GpaHelper.getGrade(72);
        String expected = "C";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_CPlus_lowerBound() {
        String actual = GpaHelper.getGrade(73);
        String expected = "C+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_CPlus_Range() {
        String actual = GpaHelper.getGrade(75);
        String expected = "C+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_BMinus_lowerBound() {
        String actual = GpaHelper.getGrade(76);
        String expected = "B-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_BMinus_Range() {
        String actual = GpaHelper.getGrade(79);
        String expected = "B-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_B_lowerBound() {
        String actual = GpaHelper.getGrade(80);
        String expected = "B";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_B_Range() {
        String actual = GpaHelper.getGrade(83);
        String expected = "B";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_BPlus_lowerBound() {
        String actual = GpaHelper.getGrade(84);
        String expected = "B+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_BPlus_Range() {
        String actual = GpaHelper.getGrade(88);
        String expected = "B+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_AMinus_lowerBound() {
        String actual = GpaHelper.getGrade(89);
        String expected = "A-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_AMinus_Range() {
        String actual = GpaHelper.getGrade(92);
        String expected = "A-";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_A_lowerBound() {
        String actual = GpaHelper.getGrade(93);
        String expected = "A";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_A_Range() {
        String actual = GpaHelper.getGrade(96);
        String expected = "A";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_APlus_lowerBound() {
        String actual = GpaHelper.getGrade(97);
        String expected = "A+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_APlus_Range() {
        String actual = GpaHelper.getGrade(99);
        String expected = "A+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    void getGradeTest_UpperBound() {
        String actual = GpaHelper.getGrade(100);
        String expected = "A+";
        Assertions.assertEquals(expected, actual, "Error in getGrade method");
    }

    @Test
    public void testGetGradeWithInvalidMarkBelowRange_exception() {
        // Test with a mark below the valid range
        int totalMark = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            GpaHelper.getGrade(totalMark);
        }, "Expected getGrade to throw, but it didn't");
    }

    @Test
    public void testGetGradeWithInvalidMarkAboveRange_exception() {
        // Test with a mark above the valid range
        int totalMark = 101;
        assertThrows(IllegalArgumentException.class, () -> {
            GpaHelper.getGrade(totalMark);
        }, "Expected getGrade to throw, but it didn't");
    }
}
