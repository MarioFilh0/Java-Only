import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double faixa, aliquota;
        double imposto1 = 0.0d;
        double imposto2 = 0.0d;
        double imposto3 = 0.0d;
        double impostototal = 0.0d;

        if(n1 >= 0.00d && n1 <= 2000.00d){
            System.out.println("Isento de renda.");
        }else if(n1 >= 2000.01d && n1 <= 3000.00d){
            faixa = n1 - 2000;
            aliquota = 0.08d;
            imposto1 = faixa*aliquota;
        }else if(n1 >= 3000.01d && n1 <= 4500.00d){
            faixa = 1000.00d; // Diferença da faixa de 2000 ~ 3000.
            aliquota = 0.08d;
            imposto1 = faixa*aliquota;
            faixa = n1 - 3000.00d;
            aliquota = 0.18d;
            imposto2 = faixa*aliquota;
            impostototal = imposto1+imposto2;
        }else{
            faixa = 1000.00d; // Diferença da faixa de 2000 ~ 3000.
            aliquota = 0.08d; // Aliquota de 8%
            imposto1 = faixa*aliquota;
            faixa = 1500.00d; // Diferença da faixa 3000 ~ 4500.
            aliquota = 0.18d; // Aliquota de 18%
            imposto2 = faixa*aliquota;
            faixa = n1 - 4500.00d; // Faixa minima de 4500.
            aliquota = 0.28d; // Aliquota de 28%
            imposto3 = faixa*aliquota;
            impostototal = imposto1+imposto2+imposto3; // Acumulativo de impostos
        }
        System.out.printf("Total: R$%.2f%n",impostototal);


    }
}