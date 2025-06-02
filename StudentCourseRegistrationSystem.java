import java.util.ArrayList;
import java.util.List;
class Course{
    private String courseCode;
    private String tittle;
    private String description;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseCode,String tittle,String description,int capacity){
        this.courseCode = courseCode;
        this.tittle = tittle;
        this.description = description;
        this.capacity = capacity;
        this.enrolledStudents = 0;

    }
    public String getCourseCode(){
        return courseCode;
    }
    public String getTittle(){
        return tittle;
    }
    public String getDescription(){
        return description;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getEnrolledStudents(){
        return enrolledStudents;
    }
    public boolean hasAvailableSlots(){
        return enrolledStudents<capacity;
    }
    public boolean enrollStudent(){
        if(hasAvailableSlots()){
            enrolledStudents++;
            return true;
        }
        return false;
    }
    public boolean removeStudent(){
        if(enrolledStudents>0){
            enrolledStudents--;
            return true;
        }
        return false;
    }
    public void displayCourseDetails(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Tittle: " + tittle);
        System.out.println("Description: " + description);
        System.out.println("Capacity: " + capacity);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Available Slots: " + (capacity-enrolledStudents));

    }
}
class Student{
    private String studentId;
    private String name;
    private List<Course>registeredCourses;
    public Student(String studentId, String name){
        this.studentId = studentId;
        this.name =name;
        this.registeredCourses = new ArrayList<>();

    }
    public boolean registerForCourse(Course course){
        if(course.enrollStudent()){
            registeredCourses.add(course);
            System.out.println(name + "successfully rgistered for " + course.getTittle());
            return true;
        }else{

            System.out.println("No available slots in " + course.getTittle() + "for" + name);
            return false;
        }

    }
    public void dropCourse(Course course){
        if(registeredCourses.contains(course)){
            if(course.removeStudent()){
                registeredCourses.remove(course);
                System.out.println(name + "successfully dropped " + course.getTittle());
                
            }else{
                System.out.println("Error : Could not drop " + course.getTittle());
            }
        }else{
            System.out.println(name + "is not registered in " + course.getTittle());
        }
    }
    public void dispalyRegisteredCourses(){
        System.out.println(name + "'s Registered Courses: ");
        for(Course course:registeredCourses){
            System.out.println(course.getTittle());
        }
    }
}
public class StudentCourseRegistrationSystem {
    public static void main(String[] args) {
        Course course1 = new Course("CS101","Introduction to Computer Science","Learn the basics of computer science.",3);
        Course course2 = new Course("MTH101","Calculus I","Introduction to calculus",2);

        Student student1 = new Student("S001","Alice");
        Student student2 = new Student("S002","Rachel");
        
        System.out.println("Available Courses");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        student1.registerForCourse(course1);
        student1.registerForCourse(course2);
        student2.registerForCourse(course2);
        student1.dispalyRegisteredCourses();
        student2.dispalyRegisteredCourses();

        student1.dropCourse(course1);
        student1.dispalyRegisteredCourses();
         
        System.out.println("\nUpdated Course Listings");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

    }

}
