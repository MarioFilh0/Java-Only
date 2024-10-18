import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int x = sc.nextInt();
        //Array
        double[] number = new double[x];
        double maior = 0;
        int indice = 0;

        for(int i = 0; i < number.length; i++) {
            System.out.print("Digite um número: ");
            number[i] = sc.nextDouble();
            //Definindo o maior valor e encontrando a posição
            if(number[i] > maior) {
                maior = number[i];
                indice = i;
            }
        }
        System.out.println("\nMAIOR VALOR = "+maior);
        System.out.println("POSICAO DO MAIOR VALOR = "+indice);


        sc.close();
    }
}