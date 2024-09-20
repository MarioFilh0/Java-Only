import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String resultado = (n1 >= 0) ? "positivo" : "negativo";

        System.out.println(resultado);
        sc.close();
        }
    }
