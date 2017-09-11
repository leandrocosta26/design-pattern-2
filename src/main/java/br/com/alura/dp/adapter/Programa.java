package br.com.alura.dp.adapter;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Relogio> relogio = new ArrayList<>();
        relogio.add(new LocalDateCustom());
        relogio.add(new CustomCalendar());
        relogio.stream().forEach(r -> System.out.println(r.getNow()));
    }
}
