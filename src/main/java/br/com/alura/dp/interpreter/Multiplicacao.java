package br.com.alura.dp.interpreter;

public class Multiplicacao implements Expressao{

    private Expressao direita;
    private Expressao esquerda;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
       this.esquerda = esquerda;
       this.direita = direita;
    }

    @Override
    public double avalia() {
        return this.esquerda.avalia() * direita.avalia();
    }
}
