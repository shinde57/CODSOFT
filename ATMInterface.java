import java.util.Scanner;

interface ATM {
        void deposite(float amt);
        void withdraw(float amt);
        void balanceCheck();
}

class UserBankAccount implements ATM {
        double balance = 0;
        @Override
        public void deposite(float amt) {
                if (amt >= 100000 || amt <= 100) {
                        System.out.println(" The Deposite amount should be Between 100 - 1,00,000");
                } else {
                        balance += amt;
                        System.out.println("Successfully Deposited");
                }
                System.out.println(" ==========================================================  \n");
        }

        @Override
        public void withdraw(float amt) {
                if (amt > balance) {
                        System.out.println("Balance Not Sufficient for Withdrwal (check balance Fist)");
                } else {
                        balance -= amt;
                        System.out.println("Successfully Withdraw");
                }
                System.out.println(" ==========================================================  \n");
        }

        @Override
        public void balanceCheck() {
                System.out.println("Your Account Balance is : " + balance);
                System.out.println(" =======================================  \n");
        }

}

public class ATMInterface {

        public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                UserBankAccount user = new UserBankAccount();
                int choice;
                float amt;
                boolean next=true;
                do{
                System.out.println(" ========================================== ATM =================================================== ");
                System.out.println(" 1: Deposite Money");
                System.out.println(" 2: Withdrawal Money ");
                System.out.println(" 3: Check Balance");
                System.out.println(" 4: exit");
                System.out.println(" ================================================================================================== ");

                System.out.println("\nEnter the Choice : ");
                choice=input.nextInt();
                switch(choice){
                        case 1:
                                System.out.println("Enter the Depositing Amount");
                                amt=input.nextInt();
                                user.deposite(amt);
                                break;

                        case 2:
                                System.out.println("Enter the Withdrawal Amount");
                                amt=input.nextInt();
                                user.withdraw(amt);
                                break;

                        case 3:
                                user.balanceCheck();
                                break;

                        case 4:
                                next=false;
                                break;

                        default:
                                System.out.println("The Invalid Choice. Please Choice Valid Option");
                }

                }while(next);
        }
}