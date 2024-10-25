package entity;

public class OperaComArray {
    //Variaveis criadas com private para melhor ''segurança''.
    private int x;
    private double soma;
    private double media;
    private double avg;
    private double last;
    private double biggest;

    //Criação do vetor
    double[] vet1;

    /*Metodo construtor com o vetor incluso para definir qual tamanho ele vai ter pelo parametro,
    e gerar os valores automaticamente*/
    public OperaComArray(int x) {
        this.x = x;
        vet1 = new double[x];
        for(int i = 0; i < vet1.length; i++) {
            vet1[i] = i*10;
        }
    }

    //Listagem dos valores do vetor
    private void listArray() {
        System.out.print("VALORES =");
        for(double v : vet1) {
            System.out.print(" "+v);
        }
    }

    //Metodo publico para caso ele seja utilizado na classe Main [TODOS OS METODOS PRIVATE ABAIXO TEM UM PUBLIC]
    public void listArrayPublic() {
        listArray();
    }

    //Percorre o vetor, passando os valores e os somando
    private void sum() {
        for(int i = 0; i < vet1.length; i++) {
            soma += vet1[i];
        }
    }

    public void sumPublic() {
        sum();
    }

    //Utiliza do total da soma para dividir com o tamanho do vetor e descobrir a media
    private void avg() {
        avg = (soma/vet1.length);
    }

    public void avgPublic() {
        avg();
    }

    /*Cada vez que inicia um loop ele passa o valor para a variavel LAST, até chegar na ultima casa para descobrir
    o ultimo valor*/
    private void lastElementArray() {
        for(int i = 0; i < vet1.length; i++) {
            last = vet1[i];
        }
    }

    public void lastElementArrayPublic() {
        lastElementArray();
    }

    /*Caso o valor presente no vetor em loop seja maior que a variavel ''biggest'', ele passa o valor para ela até
    que o loop se encerra, e então se descobre o maior valor*/
    private void bigElementArray() {
        for(int i = 0; i < vet1.length; i++) {
            if(biggest < vet1[i]) {
                biggest = vet1[i];
            }
        }
    }

    public void bigElementArrayPublic() {
        bigElementArray();
    }

    /*Da um numero pelo parametro do metodo, e então verifica se ele esta presente no vetor, caso estiver ele retorna
    true, caso não, false*/
    private boolean pam(int xy){
        for(int i = 0; i < vet1.length; i++) {
            if(xy == vet1[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean pamPublic(int xy) {
        return pam(xy);
    }

    //Getters nd Setters
    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getBiggest() {
        return biggest;
    }

    public void setBiggest(double biggest) {
        this.biggest = biggest;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    //Metodo toString para printar os resultados enquanto utiliza os metodos criados para fazer o calculo
    public String toString(int xy) {
        sum();
        avg();
        lastElementArray();
        bigElementArray();
        listArray();
        return  "\nSOMA DOS VALORES = "
                +this.soma
                +"\nMEDIA DOS VALORES = "
                +this.avg
                +"\nULTIMO ELEMENTO DO ARRAY = "
                +this.last
                +"\nMAIOR ELEMENTO DO ARRAY = "
                +this.biggest
                +"\nO NUMERO "+xy+" EXISTE? "
                +pam(xy);
    }
}