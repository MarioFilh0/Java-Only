import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo, pc; // pc = porcentagem
        double saldoTotal = 0d;

        saldo = sc.nextDouble();
        System.out.printf("Saldo atual: R$%.2f%n",saldo);
        pc = sc.nextDouble();

        saldoTotal = saldo;
        saldoTotal += (pc/100d)*saldo; // Acréscimo de salário baseado em porcentagem
        System.out.printf("Porcentagem de: %.2f%% aumentada para: R$%.2f%n", pc, saldoTotal);


        sc.close();
   }
}