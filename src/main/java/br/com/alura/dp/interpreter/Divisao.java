package br.com.alura.dp.interpreter;

public class Divisao implements Expressao{

    private final Expressao esquerda;
    private final Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        return this.esquerda.avalia() / direita.avalia();
    }
}
