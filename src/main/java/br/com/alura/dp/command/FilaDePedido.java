package br.com.alura.dp.command;

import java.util.ArrayList;
import java.util.List;

public class FilaDePedido {

    List<Comando> comandos;

    public FilaDePedido() {
        this.comandos = new ArrayList<>();
    }

    public void adiciona(Comando comando){
        this.comandos.add(comando);
    }

    public void processa(){
        comandos.stream().forEach(Comando::executa);
    }
}
