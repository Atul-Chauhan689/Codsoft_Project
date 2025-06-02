import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;
    private String grade;

     public Student(String name , int rollNumber , String grade){
        this.name = name ;
        this.rollNumber = rollNumber;
        this.grade = grade;
        
    }
    public int getRollNumber(){
        return rollNumber;
        
    }
    @Override
    public String toString(){
        return "Name :" + name + ", Roll Number :" + rollNumber + ", Grade :" + grade;
    }
       

    

}
class StudentManagementSystem{
    private List<Student> students;

    public StudentManagementSystem(){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public boolean removeStudent(int rollNumber){
        for(Student student : students){
            if(student.getRollNumber()== rollNumber){
                students.remove(student);
                return true;


            }
        }
        return false;

    }
    public Student searchStudent(int rollNumber){
        for(Student student:students){
            if(student.getRollNumber()==rollNumber){
                return student;
            }
        }
        return null;
    }
    public List<Student> getAllStudents(){
        return students;
    }
}
public class StudentManagement {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                sc.nextLine();
                System.out.println("Enter Student name: ");
                String name = sc.nextLine();
                System.out.println("Enter roll number: ");
                int rollNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter grade: ");
                String grade = sc.nextLine();

                Student newStudent = new Student(name , rollNumber , grade);
                sms.addStudent(newStudent);
                System.out.println("Student added.");
                break;

                case 2:
                System.out.println("Enter roll number of the student to remove: ");
                int rollToRemove = sc.nextInt();
                boolean removed = sms.removeStudent(rollToRemove); 
                if(removed){
                    System.out.println("Student removed.");
                }else{
                    System.out.println("Student not found.");
                }
                break;
                case 3:
                System.out.println("Enter roll number of student to search: ");
                int rollToSearch = sc.nextInt();
                
                Student searchedStudent = sms.searchStudent(rollToSearch);
                if(searchedStudent != null){
                    System.out.println("Student found.");
                    System.out.println(searchedStudent);
                }else{
                    System.out.println("Student not found.");
                }
                break;
                case 4:
                List<Student> allStudents = sms.getAllStudents();
                if(allStudents.isEmpty()){
                    System.out.println("No students to display.");
                }else{
                    System.out.println("All Students.");
                    for(Student student:allStudents){
                        System.out.println(student);
                    }
                }
                break;
                case 5:
                System.out.println("Exiting");
                sc.close();
                System.exit(0);
                break;

                default :
                System.out.println("Invalid choice. Please choose again");
                break;


            }

        }

    }
}
