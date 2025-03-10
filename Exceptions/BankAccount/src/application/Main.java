package application;

import entities.*;
import exceptions.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            sc.nextLine();

            Account acc = new Account(balance, holder, number, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            sc.nextLine();

            acc.withdraw(amount);
            System.out.printf("New balance: %.2f", acc.getBalance());
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input.");
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }

    }
}