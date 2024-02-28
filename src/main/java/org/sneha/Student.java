package org.sneha;

public class Student {
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    private String studentName;
    private String studentHobby;


    public void displayStudentDetails() {
        System.out.println("Student name: "+ studentName +", Student Hobby: "+studentHobby);
    }


}
