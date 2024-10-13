package org.example;

import java.util.Objects;

public class ShallowAndDeeoCopy {
    public static void main(String[] args) {

        Student stud1 =new Student("Tom", new  boolean[]{false, false, false, false, false, false, false, false, false,
                false});

        Student stud1ShallowCopy = stud1.shallowCopy();
        System.out.println("Compare stud1 and stud1ShallowCopy:");
        System.out.println(stud1 == stud1ShallowCopy);
        System.out.println(stud1.equals(stud1ShallowCopy));
        System.out.println(Objects.equals(stud1,stud1ShallowCopy));



        Student stud1DeepCopy = stud1.deepCopy();
        System.out.println("Compare stud1 and stud1DeepCopy:");
        System.out.println(stud1 == stud1DeepCopy);
        System.out.println(stud1.equals(stud1DeepCopy));
        System.out.println(Objects.equals(stud1,stud1DeepCopy));

    }
}
