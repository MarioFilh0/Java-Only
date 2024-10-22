import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Definindo o tamanho do vetor
        System.out.print("Quantos elementos vai ter o vetor: ");
        int x = sc.nextInt();
        sc.nextLine();

        //Criando o vetor
        double[] vet = new double[x];

        //Declarando variáveis
        double media = 0d;
        double avg = 0d;
        int v1 = 0;

        //Numerando o vetor
        for(int i = 0; i < x; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        //Calculando números pares, caso exista
        for(int i = 0; i < x; i++) {
            if(vet[i]%2 == 0) {
                v1++;
                media += vet[i];
                avg = media/v1;
            }
        }

        //Verificação se há numeros pares ou não
        if(v1 == 0) {
            System.out.println("\nNENHUM NUMERO PAR");
        }else{
            System.out.println("\nMEDIA DOS PARES = "+avg);
        }

        sc.close();
    }
}