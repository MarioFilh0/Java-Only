import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pc, val1, qtd1, val2, qtd2, total;

        val1 = sc.nextDouble();
        qtd1 = sc.nextDouble();
        val2 = sc.nextDouble();
        qtd2 = sc.nextDouble();
        pc = sc.nextDouble();

        total = (val1*qtd1)+(val2*qtd2)*(pc/100+1);

        System.out.printf("TOTAL: %.2f%n",total);



        sc.close();

    }
}