package br.com.alura.dp.flyweight;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {
    public void toca(List<Notas> notas){
        Player player =  new Player();
        StringBuilder sb = new StringBuilder();
        for(Notas n : notas){
            sb.append(n.simbolo() + " ");
        }
        player.play(sb.toString());
    }
}
