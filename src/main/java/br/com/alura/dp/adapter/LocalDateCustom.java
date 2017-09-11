package br.com.alura.dp.adapter;

import java.time.LocalDate;

public class LocalDateCustom implements Relogio {
    @Override
    public String getNow() {
        return LocalDate.now().toString();
    }
}
