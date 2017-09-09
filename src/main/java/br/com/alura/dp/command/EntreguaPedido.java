package br.com.alura.dp.command;

public class EntreguaPedido implements  Comando{

    public EntreguaPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private Pedido pedido;

    @Override
    public void executa() {
        pedido.entregue();
    }
}
