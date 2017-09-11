package br.com.alura.dp.interpreter;

public class Subtracao implements Expressao {
    private Expressao n1;
    private Expressao n2;

    public Subtracao(Expressao n1, Expressao n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public double avalia() {
        return this.n1.avalia() - this.n2.avalia();
    }
}
