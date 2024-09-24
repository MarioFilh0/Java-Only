public class Main {
    public static void main(String[] args) {

        double preco = 1500;
        //Expressão condicional ternária
        //(condição) ? (true) : (false)
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        double total = preco - desconto;

        System.out.println(preco);
        System.out.println(desconto);
        System.out.println(total);
        }
    }
