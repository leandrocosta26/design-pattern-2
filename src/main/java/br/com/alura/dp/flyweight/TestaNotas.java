package br.com.alura.dp.flyweight;

import java.util.Arrays;
import java.util.List;

public class TestaNotas {
    public static void main(String[] args) {
        NotasMusicais notasMusicais = new NotasMusicais();
        List<Notas> doReMiFa = Arrays.asList(
                notasMusicais.getNotas("do"),
                notasMusicais.getNotas("re"),
                notasMusicais.getNotas("mi"),
                notasMusicais.getNotas("fa"),
                notasMusicais.getNotas("fa"),
                notasMusicais.getNotas("fa"),

                notasMusicais.getNotas("do"),
                notasMusicais.getNotas("re"),
                notasMusicais.getNotas("do"),
                notasMusicais.getNotas("re"),
                notasMusicais.getNotas("re"),
                notasMusicais.getNotas("re"),

                notasMusicais.getNotas("do"),
                notasMusicais.getNotas("sol"),
                notasMusicais.getNotas("fa"),
                notasMusicais.getNotas("mi"),
                notasMusicais.getNotas("mi"),
                notasMusicais.getNotas("mi"),

                notasMusicais.getNotas("do"),
                notasMusicais.getNotas("re"),
                notasMusicais.getNotas("mi"),
                notasMusicais.getNotas("fa"),
                notasMusicais.getNotas("fa"),
                notasMusicais.getNotas("fa"));
        Piano piano = new Piano();

        piano.toca(doReMiFa);
    }
}
