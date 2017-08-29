package br.com.alura.dp.memento;

import java.time.LocalDate;

public class Contrato {

    private String titulo;
    private String descricao;
    private LocalDate date;
    private State state;

    public Contrato(String titulo, String descricao, State state) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.date = LocalDate.now();
        this.state = state;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public State getState() {
        return state;
    }

    public void avanca(){
        switch (this.state){
            case CRIADO:
                this.state = State.EM_ANDAMENTO;
                break;
            case EM_ANDAMENTO:
                this.state = State.ANALISADO;
                break;
            case ANALISADO:
                this.state = State.CONCLUIDO;
        }
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", date=" + date +
                ", state=" + state +
                '}';
    }
}
