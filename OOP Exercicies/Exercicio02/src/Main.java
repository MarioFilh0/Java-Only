import java.util.Scanner;
import com.entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+employee);
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double pc = sc.nextDouble();
        employee.IncreaseSalary(pc);

        System.out.println();
        System.out.println("Updated data: "+employee);

        sc.close();

    }
}