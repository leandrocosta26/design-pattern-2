package br.com.alura.dp.interpreter;

public class Numero implements Expressao {


    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public double avalia() {
        return this.numero;
    }
}
