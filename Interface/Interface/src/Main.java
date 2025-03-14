import entities.*;
import services.*;

import java.text.*;
import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        Date date = formatter.parse(sc.nextLine());
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();
        sc.nextLine();
        Contract obj = new Contract(date, totalValue, number);
        ContractService service = new ContractService();
        service.processContract(obj, 3);



    }
}