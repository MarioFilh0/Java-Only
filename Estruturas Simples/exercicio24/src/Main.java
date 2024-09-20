import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        double total = 0d;

        for(int i=0;i<n1;i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            total = x/y;

            if(y == 0){ // Denominador = 0
                System.out.println("Divisão Impossivel.");
            }else{
                System.out.printf("%.1f%n",total);
            }
        }
        sc.close();
    }
}
