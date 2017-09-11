package br.com.alura.dp.visitor;

public class Programa {

    public static void main(String[] args) {
        Expressao esquerda = new Subtracao(new Numero(20), new Numero(4));
        Expressao direita =  new Soma(new Numero(10), new Numero(12));

        Soma soma = new Soma(esquerda, direita);

        Impressora impressora = new Impressora();
        PreFixed preFixed = new PreFixed();

        soma.aceita(impressora);
        System.out.print(" = " +  String.valueOf(soma.avalia()));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        soma.aceita(preFixed);
        System.out.print(" = " +  String.valueOf(soma.avalia()));
    }
}
