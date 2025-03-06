package application;

import entities.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Empresa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double annualRent = sc.nextDouble();
            sc.nextLine();

            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenses = sc.nextDouble();
                sc.nextLine();

                Empresa pf = new Fisica(name, annualRent, healthExpenses);
                list.add(pf);

            }else if(ch == 'c'){
                System.out.print("Number of employees: ");
                int employeeNumbers = sc.nextInt();
                sc.nextLine();

                Empresa pj = new Juridica(name, annualRent, employeeNumbers);
                list.add(pj);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for(Empresa emp : list){
            System.out.println(emp.toString());
        }

        double total = 0.00d;
        for(Empresa p : list){
            total += p.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f",total);


        sc.close();
    }
}