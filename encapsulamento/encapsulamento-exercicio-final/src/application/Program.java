package application;

import entities.Account;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String accountHolder = input.nextLine();

        System.out.print("Is there any initial deposit (y/n)? ");
        char chooseDepositOption = input.next().charAt(0);
        double initialBalanceValue = 0.0;

        if (chooseDepositOption == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialBalanceValue = input.nextDouble();
            account = new Account(accountNumber, accountHolder, initialBalanceValue);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = input.nextDouble();
        account.accountDeposit(value);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = input.nextDouble();
        account.accountWithdraw(value);
        System.out.println("Updated account data: ");
        System.out.println(account);

        input.close();
    }
}
