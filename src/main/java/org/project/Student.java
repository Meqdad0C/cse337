package org.project;
import java.util.Objects;

public class Student {
    String name;
    String id;
    String activity_mark;
    String oral_mark;
    String midterm_mark;
    String final_mark;

    public Student(String name, String id, String activity_mark, String oral_mark, String midterm_mark, String final_mark) {
        this.name = name;
        this.id = id;
        this.activity_mark = activity_mark;
        this.oral_mark = oral_mark;
        this.midterm_mark = midterm_mark;
        this.final_mark = final_mark;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getActivity_mark() {
        return activity_mark;
    }

    public String getOral_mark() {
        return oral_mark;
    }

    public String getMidterm_mark() {
        return midterm_mark;
    }

    public String getFinal_mark() {
        return final_mark;
    }

     public int totalMark() {
        return Integer.parseInt(activity_mark) + Integer.parseInt(oral_mark) + Integer.parseInt(midterm_mark) + Integer.parseInt(final_mark);
    }

    public String grade() {
        return GpaHelper.getGrade(totalMark());
    }

     public double GPA() {
         Grade grade = Grade.fromRepresentation(grade()); // Obtain the Grade enum corresponding to the grade string
//         System.out.println(grade);
         return GpaHelper.getGPA(grade); // Use the Grade enum to get the GPA

//         return 0;
     }


     /*
     this function is added
        When you call assertEquals(expected, actual) in JUnit, the assertEquals method internally invokes the equals()
        method of the Student class to compare the content of the two objects (expected and actual).
      */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name) &&
                Objects.equals(id, student.id) &&
                Objects.equals(activity_mark, student.activity_mark) &&
                Objects.equals(oral_mark, student.oral_mark) &&
                Objects.equals(midterm_mark, student.midterm_mark) &&
                Objects.equals(final_mark, student.final_mark);
    }
}
