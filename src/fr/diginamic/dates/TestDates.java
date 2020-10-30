package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date1 = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.format(date1));

        DateFormat dateformat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2 = new Date(116, Calendar.MAY,19,23,59,30);
        System.out.println(dateformat2.format(date2));

        Date date3 = new Date();
        System.out.println(dateformat2.format(date3));

    }
}
