package br.com.alura.dp.visitor;

public class Numero implements Expressao {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public double avalia() {
        return this.numero;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.numero(this);
    }

    public int getNumero() {
        return numero;
    }
}
