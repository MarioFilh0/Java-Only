import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        double mp = 0d;

        for(int i=0;i<n1;i++){
            double p1 = sc.nextDouble();
            double p2 = sc.nextDouble();
            double p3 = sc.nextDouble();

            mp = (p1*2d+p2*3d+p3*5d)/(2+3+5);
            System.out.printf("Média Ponderada: %.1f%n",mp);
        }
        sc.close();
    }
}
// Peso 2, Peso 3, Peso 5
// 6,5 * 2 + 4,3 * 3 + 6,2 * 5 / 2 + 3 + 5
// 13 + 12,9 + 31 / 10
// 56,9 / 10
// 5.7