import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int x = sc.nextInt();

        //Criação dos vetores(array)
        int[] vet1 = new int[x];
        int[] vet2 = new int[x];
        int[] soma_vetor = new int[x];

        //Vetor 1
        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < x; i++) {
            vet1[i] = sc.nextInt();
            sc.nextLine();
        }
        //Vetor 2
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < x; i++) {
            vet2[i] = sc.nextInt();
            sc.nextLine();
        }
        //Soma & resultado de ambos vetores.
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < x; i++) {
            soma_vetor[i] = vet1[i] + vet2[i];
            System.out.println(soma_vetor[i]);
        }

        sc.close();
    }
}