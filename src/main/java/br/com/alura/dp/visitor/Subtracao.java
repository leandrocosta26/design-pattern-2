package br.com.alura.dp.visitor;

public class Subtracao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    private Impressora impressora;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        return this.esquerda.avalia() - this.direita.avalia();
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.subtracao(this);
    }

    public Expressao getDireita() {
        return this.esquerda;
    }

    public Expressao getEsquerda() {
        return this.direita;
    }
}
