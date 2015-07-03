package oop_2;

/**
 * Created by ITHILLEL6 on 03.07.2015.
 */
public class Group {
    private Student[] students = new Student[10];
    private int numOfStudents = 0;

    public void addStudent(Student student) {
        if (numOfStudents < students.length - 1){
            students[numOfStudents] = student;
            numOfStudents++;
        }else{
            Student[] newStudents = new Student[students.length * 2];
            for(int i = 0;i < students.length;i++){
                newStudents[i]=students[i];
            }
            newStudents[numOfStudents] = student;
            numOfStudents++;
            students = newStudents;

        }
    }

    public void addStudent(String surname) {
        Student student = new Student(numOfStudents, surname);
        addStudent(student);
    }

    public void print() {
        for(Student st: students){
            System.out.println(st.getId() + " " + st.getSurname());
        }
    }
}
