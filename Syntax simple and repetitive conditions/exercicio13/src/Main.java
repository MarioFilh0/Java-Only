import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hinicial = sc.nextInt();
        int hfinal = sc.nextInt();
        int total;

        System.out.println();

        int resultado = (hfinal > hinicial) ? total = hfinal - hinicial : 24 - hinicial + hfinal;

        System.out.println("O jogo teve duração de: "+resultado+" Horas.");

        sc.close();

    }

}

    // 02 - 03 - 04 - 05 - 06 - 07 - 08 - 09 - 10 - 11 - 12 - 13 - 14 - 15 - 16 = Duração de 14 horas
    // Hora inicial = 02 horas
    // Hora final = 16 horas
    // Duração de 14 horas.
    // A hora final é maior que a hora inicial, então se subtrai para saber a diferença de horas entre o maior e o menor horário.
    // Hora final (16) - (02) Hora inicial = Total de 14 horas de jogo.

    // 16 - 17 - 18 - 19 - 20 - 21 - 22 - 23 - 00 - 01 - 02 = Duração de 10 horas.
    // Hora inicial = 16 horas
    // Hora final = 02 horas
    // Duração de 10 horas
    // A hora inicial é maior que a hora final, então significa que se completou 24 horas apartir da hora final, então:
    // 24 - hora inicial + hora final = 10 horas


