import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;

        double triangulo = (a * c) / 2;
        double circulo = pi * (c*c);
        double trapezio = ((a+b)*c)/2;
        double quadrado = b*b;
        double retangulo = a*b;

        System.out.printf("Triangulo: %.3f%n",triangulo);
        System.out.printf("Circulo: %.3f%n",circulo);
        System.out.printf("Trapezio: %.3f%n",trapezio);
        System.out.printf("Quadrado: %.3f%n",quadrado);
        System.out.printf("Retangulo: %.3f%n",retangulo);

        sc.close();
        }
    }
