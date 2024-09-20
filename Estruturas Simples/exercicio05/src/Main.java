import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int npeca1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int npeca2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double precototal = (valor1*npeca1) + (valor2*npeca2);

        System.out.printf("Valor total = R$ %.2f%n", precototal);


    }
}
