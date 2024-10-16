import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[n];
        int[] vectNeg = new int[n];

        int neg = 0;

        for(int i = 0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if(vect[i] < 0){
                vectNeg[neg] = vect[i]; // NÃO USAR A MESMA ÍNDICE PARA DIFERENTES ARRAYS.
                neg++; // Soma da variavel para percorrer a casa da Array toda vez que entra na sintaxe.
            }
        }

        for(int i = 0; i<neg; i++) {
            System.out.println(vectNeg[i]);
        }

        sc.close();








    }
}
