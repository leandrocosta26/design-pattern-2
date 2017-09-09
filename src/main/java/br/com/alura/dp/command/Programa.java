package br.com.alura.dp.command;

public class Programa {

    public static void main(String[] args) {
        Pedido leandro = new Pedido("Leandro", 203.0);
        Pedido juliana = new Pedido("Juliana", 203.0);

        FilaDePedido filaDePedido = new FilaDePedido();
        filaDePedido.adiciona(new PagaPedido(leandro));
        filaDePedido.adiciona(new PagaPedido(juliana));
        filaDePedido.adiciona(new EntreguaPedido(juliana));

        filaDePedido.processa();
    }
}
