import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String resultado = (a%b == 0 || b%a == 0 ) ? "São multiplos." : "Não são multiplos.";

        System.out.println(resultado);

        sc.close();
        }
    }
