package org.project.integration_testing.level3;

import org.junit.jupiter.api.Test;
import org.project.InputParser;
import org.project.Student;
import org.project.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class InputParserClassMethodsTest {
    /*          parseSubject          */
    @Test
    void parseSubject_validStudent_threeArguments(){
        String name = "Software Testing", code = "cse333", fullMark ="100";
        String line = name+","+code+","+fullMark;
        Subject actual = InputParser.parseSubject(line);
        Subject expected = new Subject(name,code,fullMark);
        assertEquals(expected,actual);
    }

    @Test
    void parseSubject_invalidStudent_oneMissingArgument(){
        //full mark is missing
        String name = "Software Testing", code = "333";
        String line = name+","+code;
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseSubject(line));
    }

    @Test
    void parseSubject_invalidStudent_oneGivenArgument(){
        String name = "Software Testing";
        String line = name;
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseSubject(line));
    }

    @Test
    void parseSubject_invalidStudent_oneMoreArgument(){
        //the more arg coming from  inserting ActivitiesMark
        String name = "Software Testing", code = "333", fullMark ="50", activitiesMark = "20";
        String line = name+","+code+","+fullMark+","+activitiesMark;
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseSubject(line));
    }

    @Test
    void parseSubject_invalidStudent_noArguments(){
        String line = null;
        assertThrows(NullPointerException.class, () -> InputParser.parseSubject(line));
    }



    /*          parseStudent        */
    @Test
    void parseStudent_validStudent_sixArguments(){
        String studentName = "Monged", studentNumber = "1900563m", studentActivitiesMark ="10",
                oralMark = "10", midMark = "10", finalMark = "50";
        String line = studentName+","+studentNumber+","+studentActivitiesMark+","+oralMark+","+midMark+","+finalMark;
        Student actual = InputParser.parseStudent(line);
        Student expected = new Student(studentName,studentNumber,studentActivitiesMark,oralMark,midMark,finalMark);
        assertEquals(expected,actual);
    }

    @Test
    void parseStudent_invalidStudent_oneMissingArgument(){
        //final mark is missing
        String studentName = "Abdallah", studentNumber = "111", studentActivitiesMark ="10",
                oralMark = "10", midMark = "10";
        String line = studentName+","+studentNumber+","+studentActivitiesMark+","+oralMark+","+midMark;
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseStudent(line));
    }

    @Test
    void parseStudent_invalidStudent_oneGivenArgument(){
        String studentName = "Youssef";
        String line = studentName;
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseStudent(line));
    }

    @Test
    void parseStudent_invalidStudent_oneMoreArgument(){
        //the more arg coming from  inserting address
        String studentName = "Meqdad", studentNumber = "111", studentActivitiesMark ="10",
                oralMark = "10", midMark = "10", finalMark = "50", address = "xxx";
        String line = studentName+","+studentNumber+","+studentActivitiesMark+","+oralMark+","+midMark+","+finalMark+","+address;
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseStudent(line));
    }

    @Test
    void parseStudent_invalidStudent_noArguments(){
        String line = null;
        assertThrows(NullPointerException.class, () -> InputParser.parseStudent(line));
    }
}
