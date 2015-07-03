package oop_2;

/**
 * Created by ITHILLEL6 on 30.06.2015.
 */
public class StudentApp {
    public static void main(String[] args) {
        int [] marks = new int[10];

        Student student = new Student(5, "Ivanov" );
        Student studentCopy = new Student(student);
        Student student1 = new Student();

        System.out.println(student.getId());
        System.out.println(student.getSurname());
        System.out.println(student.getMarks());

        System.out.println();
/*
        System.out.println(studentCopy.id);
        System.out.println(studentCopy.surname);
        System.out.println(studentCopy.marks);

        System.out.println();

        */

       // student.id = 99;



    }

}
