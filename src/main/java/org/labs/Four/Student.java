package org.labs.Four;

import java.util.Objects;

public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return Objects.equals(this.name, student.getName()) && this.age == student.getAge();
    }
}
