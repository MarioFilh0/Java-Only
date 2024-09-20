import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o dia da semana? ");
        int x = sc.nextInt();

        System.out.println();
        switch (x) {
            case 1:
                System.out.println("Hoje é Segunda!");
                break;
            case 2:
                System.out.println("Hoje é Terça!");
                break;
            case 3:
                System.out.println("Hoje é Quarta!");
                break;
            case 4:
                System.out.println("Hoje é Quinta!");
                break;
            case 5:
                System.out.println("Hoje é Sexta!");
                break;
            case 6:
                System.out.println("Hoje é Sabado!");
                break;
            case 7:
                System.out.println("Hoje é Domingo!");
                break;
            default:
                System.out.println("Valor invalido.");
            }
        sc.close();
        }

}

