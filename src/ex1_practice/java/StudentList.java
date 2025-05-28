/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_practice.java;

/**
 *
 * @author mansi
 */
public class StudentList {

    private static Student[] Student;
    
    public static void main(String[] args){
        //1. create an array of Student Objects of size 5
        Student [] students =  new Student[6];
        //2. Add 5 students to the array
        Student s1= new Student("Mansi");
        Student[0] = s1;
        Student s2= new Student("Vyom");
        Student[1] = s2;
        Student s3= new Student("Ved");
        Student[2] = s3;
        Student s4= new Student("Daxa");
        Student[3] = s4;
        Student s5= new Student("Arvind");
        Student[4] = s5;
        Student s6= new Student("Krishna");
        Student[5] = s6;
        
        for(Student s:students)//for each loop - for each student s in students
        {
           System.out.println(s.getName());
           System.out.println(s.getStudentNumber());
        }
    }
    
}
