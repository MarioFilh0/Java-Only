package application;

import entities.*;

import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the numbers of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();

                ImportedProduct ip = new ImportedProduct(name, price, customsFee);
                list.add(ip);
            } else if (ch == 'u') {
                System.out.print("Manufacture date: ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                UsedProduct up = new UsedProduct(name, price, manufactureDate);
                list.add(up);
            } else {
                Product pr = new Product(name, price);
                list.add(pr);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}