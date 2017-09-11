package br.com.alura.dp.visitor;

public interface Visitor {
    void soma(Soma expressao);

    void subtracao(Subtracao expressao);

    void numero(Numero numero);
}
