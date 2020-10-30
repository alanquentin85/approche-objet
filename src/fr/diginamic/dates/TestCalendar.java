package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar date1 = new GregorianCalendar(2016, Calendar.MAY,19,23,59,30);
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateformat.format(date1.getTime()));

        Calendar date2 = Calendar.getInstance();
        DateFormat dateformat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateformat2.format(date2.getTime()));



    }
}
