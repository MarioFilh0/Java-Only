import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raio, area, pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do raio? ");
        raio = sc.nextDouble();

        area = pi * (raio*raio);

        System.out.println("Area: "+area);

        }
    }
