import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definindo o tamanho da array com a variavel "x"
        System.out.print("Quantas pessoas serão digitadas? ");
        int x = sc.nextInt();

        //Array
        double[] alt = new double[x];
        char[] gen = new char[x];

        //Variáveis
        double maiorAltura = 0d;
        double menorAltura = 0d;
        double mediaF = 0d;
        double avg = 0d;
        int F = 0;
        int M = 0;

        //Escopo dos array [altura, genero]
        for(int i = 0; i < x; i++) {
            System.out.print("Altura da "+(i+1)+"a pessoa: ");
            alt[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da "+(i+1)+"a pessoa: ");
            gen[i] = sc.next().charAt(0);
        }

        //Calculo para descobrir qual variavel tem a maior/menor altura com base no vetor [alt], e definir os valores
        for(int i = 0; i < x; i++) {
            if(alt[i] > maiorAltura) {
                maiorAltura = alt[i];
                menorAltura = maiorAltura;
            }else if(alt[i] < menorAltura) {
                menorAltura = alt[i];
            }
        }

        //Faz a média da altura das mulheres e conta quantas mulheres tem por loop para fazer a média
        //E o mesmo para a variavel 'M', mas somente para contagem -> (M+1 por loop)
        for(int i = 0; i < x; i++) {
            if(gen[i] == 'F') {
                F++;
                mediaF += alt[i];
                avg = mediaF/F;
            }else if(gen[i] == 'M') {
                M++;
            }
        }

        //Print
        System.out.println("\nMAIOR ALTURA = "+maiorAltura);
        System.out.println("MENOR ALTURA = "+menorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n",avg);
        System.out.println("Numero de homens = "+M);

        //Encerramento do scanner
        sc.close();
    }
}