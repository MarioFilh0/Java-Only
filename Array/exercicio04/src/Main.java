import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int x = sc.nextInt();
        sc.nextLine();
        //Array
        int[] num = new int[x];
        int n_par = 0;

        //Criação do array
        for(int i = 0; i < x; i++) {
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
        }

        //Impressão de números e pares
        System.out.println( "\nNUMEROS PARES:");
        for(int i = 0; i < x; i++) {
            if(num[i]%2 == 0){
                System.out.print(num[i]+" ");
                n_par++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = "+n_par);

        sc.close();
    }
}