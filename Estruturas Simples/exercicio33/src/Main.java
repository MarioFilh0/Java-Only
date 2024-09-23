import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salMinimo = 788d;
        double salUsuario;
        int totalGanho = 0;

        salUsuario = sc.nextDouble();

        while(salUsuario >= salMinimo){
            totalGanho += 1;
            salUsuario = salUsuario-788;
        }

        System.out.println("O Salário do usuário equivale a: "+totalGanho+" salários minimos.");

        sc.close();


    }
}