package br.com.alura.dp.visitor;

public class PreFixed implements Visitor {
    @Override
    public void soma(Soma expressao) {
        System.out.print("( + ");
        expressao.getEsquerda().aceita(this);
        System.out.print(" ");
        expressao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void subtracao(Subtracao expressao) {
        System.out.print("( - ");
        expressao.getEsquerda().aceita(this);
        System.out.print(" ");
        expressao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void numero(Numero numero) {
        System.out.print(numero.getNumero());
    }
}
