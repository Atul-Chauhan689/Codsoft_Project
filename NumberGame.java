import java.util.Scanner;
public class NumberGame {
    public static void main(String []args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your guess:");
        int num = obj.nextInt();
        int d = (int)(Math.random()*100);
        System.out.println("random number is : " + d);
        if(d==num){
            System.out.println("You won!!");
        }
        else if((d-num<=5)&&(d-num>=-5)){
            System.out.println("Just reached try again");
        }
        else if((d-num<=10)&&(d-num>=-10)){
            System.out.println("diff very small try again");
        }
        else if((d-num<=20)&&(d-num>=-20)){
            System.out.println("diff small try again");
        }
        else if((d-num<=30)&&(d-num>=-30)){
            System.out.println("diff mid try again");
        }
        else if((d-num<=40)&&(d-num>=-40)){
            System.out.println("diff large try again");
        }
        else if((d-num<=50)&&(d-num>=-50)){
            System.out.println("diff very large try again");
        }
        else{
            System.out.println("diff very very large try again");
        }
    }

}
