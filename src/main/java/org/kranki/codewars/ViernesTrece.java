package org.kranki.codewars;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import java.time.temporal.TemporalAdjusters;


public class ViernesTrece {
    public static void main(String[] args) {
        System.out.println(unluckyDays(2015));
    }

    public static int unluckyDays(int year) {
        LocalDate fecha = LocalDate.of(year, 1, 1);
        Month mes = fecha.getMonth();
        int c = 0;
        for (int i = 1; i <= mes.maxLength(); i++) {
            if (i == 13) {
                LocalDate date = LocalDate.of(year, mes, i);
                DayOfWeek dayOfWeek = date.getDayOfWeek();
                if (dayOfWeek == DayOfWeek.FRIDAY) {
                    c++;
                    if (mes.getValue() == 12) {
                        break;
                    }
                    i = 0;
                    mes = mes.plus(1);
                    continue;
                }
                if (mes.getValue() == 12) {
                    break;
                }
                mes = mes.plus(1);
                i = 0;
            }
        }
        return c;
    }


}
