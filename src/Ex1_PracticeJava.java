import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import ex1_practice.java.Student;

public class Ex1_PracticeJava {

/**
 *
 * @author mansi
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         
        Student [] students = new Student[2];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<students. length; i++) {
          System.out.println("enter student name");
          String name = input.nextLine();
          Student student;
            student = new Student(name);
          students [i]=student;

        }
        System.out.println("printing the students");
        String format="The student's name is %s\n";
        for(Student student:students)
        {
            System.out.printf(format, student.getName());
        }
    
    
    }

}