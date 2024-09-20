import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = 0;
        String prd = "";
        boolean codigovalido = false;

        while(!codigovalido){
            int codigo = sc.nextInt();
            int qtd = sc.nextInt();

            switch(codigo) {
                case 1:
                    prd = "Cachorro Quente"; // 4 Reais
                    preco = 4 * qtd;
                    codigovalido = true;
                    break;
                case 2:
                    prd = "X-Salada"; // 4.50 Reais
                    preco = 4.50 * qtd;
                    codigovalido = true;
                    break;
                case 3:
                    prd = "X-Bacon";// 5.00 Reais
                    preco = 5.00 * qtd;
                    codigovalido = true;
                    break;
                case 4:
                    prd = "Torrada simples";  // 2.00 Reais
                    preco = 2.00 * qtd;
                    codigovalido = true;
                    break;
                case 5:
                    prd = "Refrigerante";  // 1.50 Reais
                    preco = 1.50 * qtd;
                    codigovalido = true;
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
           }
        }
        System.out.printf("Pedido:\n%s\nR$: %.2f\n", prd, preco);
        sc.close();
    }


}




