import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while(senha != 2002){ // Caso a condição seja TRUE, o código sera lido, e caso sera false, a condição se encerra.
            System.out.println("Senha inválida!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido.");

        sc.close();
        }
    }
