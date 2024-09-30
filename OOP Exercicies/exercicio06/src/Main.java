import java.util.Scanner;
import entity.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fatura fatura;

        System.out.print("Digite o número do equipamento: ");
        String numero = sc.next();
        System.out.print("Digite a descricao do equipamento: ");
        String descricao = sc.next();
        System.out.print("Qual a quantia solicitada do equipamento: ");
        int qtd_Comprada = sc.nextInt();
        if(qtd_Comprada < 0){
            qtd_Comprada = 0;
        }
        System.out.print("Digite o preço do equipamento: ");
        double preco = sc.nextDouble();
        if(preco < 0d){
            preco = 0.0d;
        }

        fatura = new Fatura(numero, descricao, qtd_Comprada, preco);
        System.out.println("--- ITEM ---");
        System.out.println(fatura);
        System.out.println("-- FATURA -- ");
        System.out.printf("%.2f R$",fatura.getTotalFatura());


        sc.close();
    }
}