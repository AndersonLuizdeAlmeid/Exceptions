package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.Exceptions;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();

        sc.nextLine();

        System.out.print("Holder: ");
        String name = sc.nextLine();

        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();

        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, name, initialBalance, withdrawLimit);

        try {
            System.out.println("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println("New balance: " + (account.getBalance() - withdraw));
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
