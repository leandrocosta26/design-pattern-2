package br.com.alura.dp.visitor;

public interface Expressao {
    double avalia();
    void aceita(Visitor impressora);
}
