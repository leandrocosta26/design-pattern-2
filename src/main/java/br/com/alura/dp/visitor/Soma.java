package br.com.alura.dp.visitor;

public class Soma implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        return this.esquerda.avalia() + this.direita.avalia();
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.soma(this);
    }

    public Expressao getDireita() {
        return this.esquerda;
    }

    public Expressao getEsquerda() {
        return this.direita;
    }
}
