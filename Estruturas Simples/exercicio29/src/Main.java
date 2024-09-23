import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int meses, ano, dia, total;

        ano = sc.nextInt();
        meses = sc.nextInt();
        dia = sc.nextInt();

        total = (ano*365)+(meses*30) + dia;
        System.out.println(total);

        sc.close();



    }
}