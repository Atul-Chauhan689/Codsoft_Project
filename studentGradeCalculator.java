import java.util.*;
public class studentGradeCalculator {
    public static void grade(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of maths :");
    float mths  = sc.nextFloat();
    System.out.println("Enter the marks of physics :");
    float phy = sc.nextFloat();
    System.out.println("Enter the marks of chemistry :");
    float chem  = sc.nextFloat();
    System.out.println("Enter the marks of english :");
    float eng  = sc.nextFloat();
    System.out.println("Enter the marks of any optional subject :");
    float opt  = sc.nextFloat();
    float percentage = (mths+phy+chem+eng+opt)/5;
    if(percentage>=90){
       System.out.println("Grade: A");
    }
    else if(percentage>=80 && percentage<90){
        System.out.println("Grade: B");
    }
    else if(percentage>=70 && percentage<80){
        System.out.println("Grade: C");
    }
    else if(percentage>=60 && percentage<70){
        System.out.println("Grade: D");
    }
    else if(percentage>=40 && percentage<60){
        System.out.println("Grade: E");
    }
    else{
        System.out.println("Grade: F");
    }
   

}


    public static void main(String []args){
        grade();

}
}
     


