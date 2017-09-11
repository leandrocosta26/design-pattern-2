package br.com.alura.dp.interpreter;

public class Programa {

    public static void main(String[] args) {
        Expressao esquerda = new Subtracao(new Numero(20), new Numero(4));
        Expressao direita =  new Soma(new Numero(10), new Numero(12));

        Soma soma = new Soma(esquerda, direita);
        System.out.println(soma.avalia());

        System.out.println(new Multiplicacao(esquerda,direita).avalia());

        System.out.println(new Divisao(esquerda,direita).avalia());
    }

}
