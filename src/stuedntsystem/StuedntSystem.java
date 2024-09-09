/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stuedntsystem;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author 27731
 */
public class StuedntSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
        
        while(running){
            System.out.println("\n1.Capture a new student");
            System.out.println("2. Search for  a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit application");
            
            System.out.println("Please enter your choice");
            
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:                    
                    System.out.println("Enter student ID, student ID must be 5 didgits long");
                    String id = scanner.nextLine();
                    System.out.println("Enter student name and surname");
                    String name = scanner.nextLine();
                    System.out.println("Enter student email");
                    String email = scanner.nextLine();
                    System.out.println("Enter student age, age must be above 15!!");
                    int age = scanner.nextInt();
                    System.out.println("Enter student email");
                    String course = scanner.nextLine();
                    if(id.length()==5 && age > 15){
                        students.add(new Student(id,name,age,email,course));
                        System.out.println("Student added successfully");
                    } else{
                        System.out.println("Invalid input. Please try again");
                    }
                     break;
                case 2:
                    System.out.println("Enter student id to search");
                    String searchid = scanner.nextLine();
                    boolean found = false;
                     for(Student student: students){
                         if(student.id.equals(searchid)){
                             System.out.println("Student found");
                             System.out.println("ID: " + student.id);
                             
                             System.out.println("name: " + student.name);
                             
                             System.out.println("age: " + student.age);
                             
                             System.out.println("email: " + student.email);
                             
                             System.out.println("course: " + student.course);
                             
                             found = true;
                             break;
                         }
                     }
                     if(!found){
                         System.out.println("Student not found!!");
                     }
                case 3:
                    System.out.println("Enter student ID to delete");
                    String deleteid = scanner.nextLine();
                    boolean deleted = false;
                     for(Student student: students){
                         if(student.id.equals(deleteid)){
                             students.remove(student);
                             System.out.println("Student successfully removed...");
                             deleted = true;
                             break;
                         }
                     }
                     if(!deleted){
                         System.out.println("Student not found");
                                 }
                     break;
                case 4:
                    if(students.isEmpty()){
                        System.out.println("Students report not found");
                    }
                     else{
                         System.out.println("Student report: ");
                         for(Student student: students){
                             System.out.println("ID "+ student.id);
                             
                             System.out.println("Name "+ student.name);
                              
                             System.out.println("Age "+ student.age);
                               
                             System.out.println("email "+ student.email);
                                
                             System.out.println("Course "+ student.course);
                                 
                             System.out.println("**************************");
                         }
                     }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application, Thank you");
                    break;
            }
        }
        scanner.close();
    }
    
}
