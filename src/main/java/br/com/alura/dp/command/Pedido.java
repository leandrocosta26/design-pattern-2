package br.com.alura.dp.command;

public class Pedido {

    private String cliente;
    private Double valor;
    private Status status;

    public Pedido(String cliente, Double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.CRIADO;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void paga(){
        this.status = Status.PAGO;
    }

    public void entregue(){
        this.status = Status.ENTREGUE;
    }
}
