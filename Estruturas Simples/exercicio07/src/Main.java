import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double op = 50;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos você consumiu no telefone? ");
        double min = sc.nextDouble();

        if(min > 100){
            op += (min - 100) * 2;
        }System.out.printf("Valor a ser pago: R$ %.2f%n", op);

        sc.close();
        }
    }