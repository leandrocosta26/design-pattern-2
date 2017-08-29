package br.com.alura.dp.memento;

public class TestaMemento {
    public static void main(String[] args) {
        Historico historico = new Historico();

        Contrato contrato = new Contrato("Brastemp Geladeiras", "Contrato que estabelece ", State.CRIADO);

        historico.add(new Estado(contrato).save());

        contrato.avanca();
        historico.add(new Estado(contrato).save());

        contrato.avanca();
        historico.add(new Estado(contrato).save());

        contrato.avanca();
        historico.add(new Estado(contrato).save());

        historico.printAll();
    }
}
