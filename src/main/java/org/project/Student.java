package org.project;

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

//    public static void main (String[] args){
//        String name = "Abdelmagid";
//        String id =  "1111";
//        String activity_mark = "10";
//        String oral_mark = "10";
//        String midterm_mark = "10";
//        String final_mark = "35";
//        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);
//        double gpa = st.GPA();
//    }
}
