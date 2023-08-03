package Transportadora;

public abstract class Transportadora {

    protected int altura;
    protected int largura;

    public Transportadora(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public abstract double calculaFrete();
}
