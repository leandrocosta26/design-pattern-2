package br.com.alura.dp.memento;

public class Estado {

    private Contrato contrato;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
    }

    public Estado save(){
        return new Estado(new Contrato(contrato.getTitulo(),contrato.getDescricao(), contrato.getState()));
    }

    @Override
    public String toString() {
        return "Estado{" +
                "contrato=" + contrato +
                '}';
    }
}
