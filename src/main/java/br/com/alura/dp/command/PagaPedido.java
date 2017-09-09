package br.com.alura.dp.command;

public class PagaPedido implements Comando {

    private Pedido pedido;

    public PagaPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Pedido pago " + pedido.getCliente());
        pedido.paga();
    }
}
