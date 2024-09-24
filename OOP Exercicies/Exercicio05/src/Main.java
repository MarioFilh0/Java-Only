import com.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dol = sc.nextDouble();
        System.out.println("How many dollars wil be bought?  ");
        double dol_bought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = R$%.2f%n", CurrencyConverter.convertReais(dol, dol_bought));

        sc.close();

    }
}