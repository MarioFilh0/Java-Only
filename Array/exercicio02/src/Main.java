import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        sc.nextLine();

        //Criação do vetor ou array
        double[] vec = new double[n];

        for(int i = 0;i < vec.length; i++) {
            System.out.print("Digite um número: ");
            vec[i] = sc.nextDouble();
        }
        System.out.println();

        System.out.print("VALORES = ");
        for(int i = 0; i < vec.length; i++) {
            System.out.printf("%.1f ",vec[i]);
        }
        System.out.println();

        //Soma do vetor
        double sum = 0d;
        for(int i = 0; i < vec.length; i++) {
            sum += vec[i];
        }
        System.out.printf("SOMA = %.2f%n",sum);

        //Media do vetor
        double avg = (sum/vec.length);
        System.out.printf("MÉDIA = %.2f%n",avg);

        sc.close();
    }
}