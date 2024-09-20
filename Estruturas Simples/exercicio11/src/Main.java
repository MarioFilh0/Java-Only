import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String resultado = (n1%2 == 0 ) ? "O numero "+n1+" é par" : "O numero "+n1+" é impar";

        System.out.println(resultado);
        sc.close();
        }
    }
