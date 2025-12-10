package com.excelR.Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DataAndTimeProgram1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date"+localDate);
        System.out.println(localDate.getDayOfWeek());

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());

        LocalDate first= localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate last= localDate.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(" first " + first);
        System.out.println(" last " + last);


        LocalDate firstDay=localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay=localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(" firstDay " + firstDay);
        System.out.println(" lastDay " + lastDay);















        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time"+localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current DateTime"+localDateTime);
    }
}
