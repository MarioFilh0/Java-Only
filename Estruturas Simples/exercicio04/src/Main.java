import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horast = sc.nextInt();
        double vhora = sc.nextDouble();

        double salario = horast*vhora;

        System.out.println("Número do funcionário: "+num);
        System.out.printf("Salario do funcionário: R$ %.2f%n",salario);

        sc.close();
        }
    }
