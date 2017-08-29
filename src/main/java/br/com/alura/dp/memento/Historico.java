package br.com.alura.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Estado> estados;

    public Historico() {
        this.estados = new ArrayList<>();
    }

    public void add(Estado estado){
        this.estados.add(estado);
    }

    public Estado get(int index){
        return this.estados.get(index);
    }

    public void printAll(){
        this.estados.stream().forEach(System.out::print);
    }
}
