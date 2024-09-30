package entity;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtd_Comprada;
    private double preco;


    //Getters nd Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_Comprada() {
        return qtd_Comprada;
    }

    public void setQtd_Comprada(int qtd_Comprada) {
        this.qtd_Comprada = qtd_Comprada;
    }

    //Construtor

    public Fatura(String numero, String descricao, int qtd_Comprada, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.qtd_Comprada = qtd_Comprada;
        this.preco = preco;
    }

    //Métodos

    public double getTotalFatura(){
        return qtd_Comprada*preco;
    }

    public String toString() {
        return String.format("NUMERO: "
                + numero
                + '\n'
                + "DESCRIÇÃO: "
                + descricao
                + '\n'
                + "QUANTIDADE: "
                + qtd_Comprada
                + '\n'
                + "PREÇO: R$"
                + String.format("%.2f",preco));
    }
}
