public class Main {
    public static void main(String[] args) {

        //Criação de vetores
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        //Resultado = 4, porque, caso usar somente .lenght ele seria 5, não dando casas suficientes [EXEMPLO LINHA 17]
        //>> CONTAGEM A PARTIR DO 0 <<
        int vetQuantidade = vet1.length-1;

        //Guarda valores automaticamente a partir do i*10 [0*10] [1*10] [2*10] etc.. sendo i+1 por for
        for(int i = 0; i < vet1.length; i++) {
            vet1[i] = i*10;
        }

        //Subtrai as casas da array cada vez que se encerra um loop [4-0] [4-1] [4-2] [4-3] [4-4] > [5]
        for(int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[vetQuantidade-i];
        }

        //Print
        System.out.println("-- PRIMEIRO ARRAY -- ");
        for(int x : vet1) {
            System.out.print(" "+x);
        }

        //Print
        System.out.println("\n-- ARRAY INVERTIDO --");
        for(int y : vet2) {
            System.out.print(" "+y);
        }

    }
}