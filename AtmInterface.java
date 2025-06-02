import java.util.*;
public class AtmInterface {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int main_balance = 50000;
        while(true){
            System.out.println("WELCOME TO ");
            System.out.println(" A  . T  .M ");
            System.out.println("Enetr 1 to check balance");
            System.out.println("Enter 2 for withdraw money");
            System.out.println("Enter 3 for deposit money");
            System.out.println("Enter 4 for exit");
            System.out.println("Choose option for further process");
            int option = sc.nextInt();
            switch(option){
                case 1 : 
                System.out.println("Your remaining balance is :" + main_balance);
                System.out.println("THANK YOU " + java.time.LocalDateTime.now());
                break;
                case 2 :
                System.out.println("Enter amount to withdraw");
                int withdraw = sc.nextInt();
                if(main_balance>=withdraw){
                    System.out.println("Please collect your money");
                    main_balance-=withdraw;
                    System.out.println("Remaining balance is : " + main_balance);
                    System.out.println("THANK YOU " + java.time.LocalDateTime.now());
                }
                else{
                    System.out.println("Insufficient balance ");
                }
                break;
                case 3 :
                System.out.println("Enter amount to deposit ");
            }
            int amount = sc.nextInt();
            main_balance += amount;
            System.out.println("Your money has been deposited successfully");
            System.out.println("Your main balance  is " + main_balance);
            System.out.println("THANK YOU " + java.time.LocalDateTime.now());
            break;
        
    
        }
    }
}
