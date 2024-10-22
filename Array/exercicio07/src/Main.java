import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int x = sc.nextInt();
        sc.nextLine();

        //Criação do vetor
        double[] vet = new double[x];

        for(int i = 0; i < x; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        //Criando a média do vetor
        double media = 0d;
        double avg = 0d;

        for(int i = 0; i < x; i++) {
            media += vet[i];
            avg = media/vet.length;
        }
        System.out.println("\nMEDIA DO VETOR: "+avg);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < x; i++) {
            if(avg > vet[i]) {
                System.out.println(vet[i]);
            }
        }

        sc.close();

    }
}