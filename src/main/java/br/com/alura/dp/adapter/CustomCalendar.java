package br.com.alura.dp.adapter;

import java.util.Calendar;

public class CustomCalendar implements Relogio {
    @Override
    public String getNow() {
        return Calendar.getInstance().getTime().toString();
    }
}
