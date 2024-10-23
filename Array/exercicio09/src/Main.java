import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definindo o tamanho da array
        System.out.print("Quantas pessoas serão digitalizadas? ");
        int x = sc.nextInt();
        sc.nextLine();

        //Criação da array
        String[] nome = new String[x];
        int[] idade = new int[x];

        //Variavel
        int subs = 0;
        String nomeVelho = "";

        //Definindo escopo dos vetores
        for(int i = 0; i < x; i++) {
            System.out.println("Dados da "+(i+1)+"a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }

        //Passando nome e idade da var mais velha
        for(int i = 0; i < x; i++) {
            if(idade[i] > subs) {
                subs = idade[i];
                nomeVelho = nome[i];
            }
        }

        //Print
        System.out.println("\nPESSOA MAIS VELHA: "+nomeVelho);

        sc.close();
    }
}