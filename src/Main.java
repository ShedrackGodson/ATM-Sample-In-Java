import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); // Input Scanner
        int getID, operator;
        double amount;
        Account accountObj = new Account(); // Account Object Instantiation
        accountObj.setBalance(100); // Set initial balance to 100
        int[] IDsArray = {0,1,2,3,4,5,6,7,8,9};

       outer: do {
           System.out.println("Enter your account ID: ");
           getID = input.nextInt();
           if (getID==IDsArray[0]||getID==IDsArray[1]||getID==IDsArray[2]||getID==IDsArray[3]||getID==IDsArray[4]||getID==IDsArray[5]
           ||getID==IDsArray[6]||getID==IDsArray[7]||getID==IDsArray[8]||getID==IDsArray[9]){
               System.out.println("MAIN MENU\n1.\tCheck Balance\n2.\tWithdraw\n3.\tDeposit\n4.\tExit");
               operator = input.nextInt();
               if (operator == 1) {
                   System.out.println("The current balance is: "+accountObj.getBalance());
//                   break;
               } else if(operator == 2) {
                   System.out.println("Enter an amount to withdraw: ");
                   amount = input.nextDouble();
                   accountObj.withdraw(amount);
               } else if(operator == 3) {
                   System.out.println("Enter an amount to deposit: ");
                   amount = input.nextDouble();
                   accountObj.deposit(amount);
               } else if(operator == 4) {
                   break;
               }

           } else {
               System.out.println("Please enter a correct ID.");
           }
       } while (true);//           System.out.println("While");

    }
}
