package Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.InputParser;
import org.project.InputValidator;
import org.project.Student;
import org.project.Subject;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class InputParserTest {

    /*                          parseSubject Method Testing                                */
    @Test
    void parseSubject_validStudent_threeArguments(){
        InputValidator mockValidator = mock(InputValidator.class);
        String name = "Software Testing", code = "333", fullMark ="50";
        String line = name+","+code+","+fullMark;
        when(mockValidator.validateSubject(name,code,fullMark)).thenReturn(true);
        Subject actual = InputParser.parseSubject(line, mockValidator);
        Subject expected = new Subject(name,code,fullMark);
        assertEquals(expected,actual);
    }

    @Test
    void parseSubject_invalidStudent_oneMissingArgument(){
        //full mark is missing
        InputValidator mockValidator = mock(InputValidator.class);
        String name = "Software Testing", code = "333";
        String line = name+","+code;
        when(mockValidator.validateSubject(name,code,"")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseSubject(line, mockValidator));
    }

    @Test
    void parseSubject_invalidStudent_oneGivenArgument(){
        InputValidator mockValidator = mock(InputValidator.class);
        String name = "Software Testing";
        String line = name;
        when(mockValidator.validateSubject(name,"","")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseSubject(line, mockValidator));
    }

    @Test
    void parseSubject_invalidStudent_oneMoreArgument(){
        //the more arg coming from  inserting ActivitiesMark
        InputValidator mockValidator = mock(InputValidator.class);
        String name = "Software Testing", code = "333", fullMark ="50", activitiesMark = "20";
        String line = name+","+code+","+fullMark+","+activitiesMark;
        when(mockValidator.validateSubject(name,code,fullMark)).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseSubject(line, mockValidator));
    }

    @Test
    void parseSubject_invalidStudent_noArguments(){
        InputValidator mockValidator = mock(InputValidator.class);
        String line = null;
        when(mockValidator.validateSubject("","","")).thenReturn(true);
        assertThrows(NullPointerException.class, () -> InputParser.parseSubject(line, mockValidator));
    }

    /*                          parseStudent Method Testing                                */

    @Test
    void parseStudent_validStudent_sixArguments(){
        InputValidator mockValidator = mock(InputValidator.class);
        String studentName = "Monged", studentNumber = "222", studentActivitiesMark ="10",
                oralMark = "10", midMark = "10", finalMark = "50";
        String line = studentName+","+studentNumber+","+studentActivitiesMark+","+oralMark+","+midMark+","+finalMark;
        when(mockValidator.validateStudent(studentName,studentNumber,studentActivitiesMark,oralMark,midMark,finalMark)).thenReturn(true);
        Student actual = InputParser.parseStudent(line, mockValidator);
        Student expected = new Student(studentName,studentNumber,studentActivitiesMark,oralMark,midMark,finalMark);
        assertEquals(expected,actual);
    }

    @Test
    void parseStudent_invalidStudent_oneMissingArgument(){
        //final mark is missing
        InputValidator mockValidator = mock(InputValidator.class);
        String studentName = "Abdallah", studentNumber = "111", studentActivitiesMark ="10",
                oralMark = "10", midMark = "10";
        String line = studentName+","+studentNumber+","+studentActivitiesMark+","+oralMark+","+midMark;
        when(mockValidator.validateStudent(studentName,studentNumber,studentActivitiesMark,oralMark,midMark,"")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseStudent(line, mockValidator));
    }

    @Test
    void parseStudent_invalidStudent_oneGivenArgument(){
        InputValidator mockValidator = mock(InputValidator.class);
        String studentName = "Youssef";
        String line = studentName;
        when(mockValidator.validateStudent(studentName,"","","","","")).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseStudent(line, mockValidator));
    }

    @Test
    void parseStudent_invalidStudent_oneMoreArgument(){
        //the more arg coming from  inserting address
        InputValidator mockValidator = mock(InputValidator.class);
        String studentName = "Meqdad", studentNumber = "111", studentActivitiesMark ="10",
                oralMark = "10", midMark = "10", finalMark = "50", address = "xxx";
        String line = studentName+","+studentNumber+","+studentActivitiesMark+","+oralMark+","+midMark+","+finalMark+","+address;
        when(mockValidator.validateStudent(studentName,studentNumber,studentActivitiesMark,oralMark,midMark,finalMark)).thenReturn(true);
        assertThrows(IllegalArgumentException.class, () -> InputParser.parseStudent(line, mockValidator));
    }

    @Test
    void parseStudent_invalidStudent_noArguments(){
        InputValidator mockValidator = mock(InputValidator.class);
        String line = null;
        when(mockValidator.validateStudent("","","","","","")).thenReturn(true);
        assertThrows(NullPointerException.class, () -> InputParser.parseStudent(line, mockValidator));
    }

}
