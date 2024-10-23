import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definindo o tamanho da array
        System.out.print("Quantos alunos serão digitalizados? ");
        int x = sc.nextInt();
        sc.nextLine();

        //Arrays
        double[] nota1S = new double[x];
        double[] nota2S = new double[x];
        String[] nome = new String[x];
        double[] media = new double[x];

        //Escopo das arrays [nome, nota 1 semestre, nota 2 semestre]
        for(int i = 0; i < x; i++) {
            System.out.println("Digite o nome, primeira e segunda nota do "+(i+1)+"o aluno:");
            nome[i] = sc.nextLine();
            nota1S[i] = sc.nextDouble();
            nota2S[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nAlunos aprovados:");
        //Criando a media dos alunos, caso a media for maior ou igual que 6, o aluno correspondente será aprovado
        for(int i = 0; i < x; i++) {
            media[i] = (nota1S[i]+nota2S[i])/2;
            if(media[i] >= 6) {
                System.out.println(nome[i]);
            }
        }

        //Encerramento do scanner
        sc.close();
    }
}