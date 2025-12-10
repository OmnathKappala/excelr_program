package com.excelR.Java8Features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterProgram {
    public static void main(String[] args) {
        LocalDate first=LocalDate.now();
        System.out.println("First: " + first);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(first));
    }
}
