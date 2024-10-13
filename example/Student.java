package org.example;

import java.util.Objects;

public class Student {

    private String name;
    private   boolean[] subjectsStudied = new boolean[10];


    public Student(String name,boolean[] subjectsStudied) {
        this.name = name;
        this.subjectsStudied = subjectsStudied;
    }

    public Student shallowCopy(){
        Student stud = new Student(this.name,this.subjectsStudied);
        return stud;
    }
    public Student deepCopy() {
        boolean[] subjectsStudied = new boolean[]{};
        Student stud = new Student(this.name, subjectsStudied);
        return stud;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student stud = (Student) o;
        return Objects.equals(name, stud.name) && Objects.equals(subjectsStudied, stud.subjectsStudied);
    }

}
