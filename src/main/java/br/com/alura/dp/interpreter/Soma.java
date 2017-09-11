package br.com.alura.dp.interpreter;

public class Soma implements Expressao {

    private Expressao n1;
    private Expressao n2;

    public Soma(Expressao n1, Expressao n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public double avalia() {
        return this.n1.avalia() + this.n2.avalia();
    }
}
