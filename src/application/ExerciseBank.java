package application;

import Entities.BankManager;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseBank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankManager clientAccount = null;
        System.out.println("Welcome to New Bank System!");
        int exit = 1;
        while(exit != 0){
            System.out.println("Select the best option for you below:");
            System.out.println("1 - Create Account");
            System.out.println("2 - Deposit Money");
            System.out.println("3 - Withdraw Money");
            System.out.println("4 - Cancel Operation");
            int option = sc.nextInt();

            if (option == 1) {
                sc.nextLine();
                System.out.println("Would you like to make an initial deposit? (Y/N)");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("y")) {
                    System.out.println("Insert your Account Name:");
                    String accountName = sc.nextLine();
                    System.out.println("Insert your Account Number:");
                    String accountNumber = sc.nextLine();
                    System.out.println("Insert your Initial Deposit:");
                    double deposit = sc.nextDouble();
                    sc.nextLine();
                    clientAccount = new BankManager(accountName, accountNumber, deposit);
                    System.out.println(clientAccount);
                } else {
                    System.out.println("Insert your Name:");
                    String accountName = sc.nextLine();
                    System.out.println("Insert your Number Account:");
                    String accountNumber = sc.nextLine();
                    clientAccount = new BankManager(accountName, accountNumber);
                    System.out.println(clientAccount);
                }
            } else if (option == 2) {
                sc.nextLine();
                System.out.println("What is the deposit amount?");
                double depositMoney = 0.0;
                depositMoney = sc.nextDouble();
                if (clientAccount != null) {
                    clientAccount.addDeposit(depositMoney);
                    System.out.println(clientAccount);
                }
            } else if (option == 3) {
                sc.nextLine();
                System.out.println("What is the withdraw amount?");
                double removeMoney = 0.0;
                removeMoney = sc.nextDouble();
                if (clientAccount != null) {
                    clientAccount.withdrawMoney(removeMoney);
                    System.out.println(clientAccount);
                }

            } else if (option == 4) {
                sc.nextLine();
                exit = 0;
            }


        }
        sc.close();
    }

}
