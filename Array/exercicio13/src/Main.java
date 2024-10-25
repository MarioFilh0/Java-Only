import entity.OperaComArray;

public class Main {
    public static void main(String[] args) {
        //Construtor e o valor no parâmetro para definir o tamanho do array
        OperaComArray array = new OperaComArray(15);

        /*
        Uso dos metodos public como exemplo:

        array.listArrayPublic();
        System.out.println();
        array.sumPublic();
        array.avgPublic();
        array.lastElementArrayPublic();
        array.bigElementArrayPublic();
        array.imprimir();
        System.out.println(array.pamPublic(30));

        Mas para utilizar eles, era necessario fazer o calculo passando o metodo public antes do metodo de impressão,
        então optei por utilizar o toString por ser mais organizado e prático, pelo menos nesta ocasião
        */

        System.out.println(array.toString(141));



    }
}