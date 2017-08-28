package br.com.alura.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
    private static Map<String, Notas> notas = new HashMap<String, Notas>();

    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("do", new Do());
        notas.put("si", new Si());
    }

    public Notas getNotas(String nota){
        return this.notas.get(nota);
    }
}
