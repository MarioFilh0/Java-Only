import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, suc, ant;

        n1 = sc.nextInt();
        suc = n1 + 1;
        ant = n1 - 1;

        System.out.println("Valor escolhido: "+n1+", seu sucessor: "+suc+", seu antecessor: "+ant);


    }
}