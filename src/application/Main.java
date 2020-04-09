package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) throws ParseException {

//        SOMENTE DATA - Date
// TESTE a
        Scanner sc = new Scanner(System.in);

//        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//
//        Date x1 = new Date();
//        Date x2 = new Date(System.currentTimeMillis());
//        Date x3 = new Date(0L);
//
//        Date y1 = sdf1.parse("09/04/2020");
//        Date y2 = sdf1.parse("09/04/2020 14:01:20");
//        Date y3 = Date.from(Instant.parse("2020-04-09T14:01:20Z"));
//
//        System.out.println("DATA COM PADRÃO UTC: " + sdf2.format(y3));
//        System.out.println("DATA COM MILISEGUNDOS 0: " + sdf1.format(x3));
//        System.out.println("DATA ATUAL: " + sdf1.format(x1));
//        System.out.println("DATA E HORA ATUAL: " + sdf2.format(x1));
//        System.out.println(sdf1.format(y1));
//        System.out.println(sdf2.format(y2));

//        CALENDAR
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y4 = Date.from(Instant.parse("2020-04-09T14:01:20Z"));
        System.out.println("DATA COM PADRÃO UTC: " + sdf3.format(y4));

        Calendar cal = Calendar.getInstance();
        cal.setTime(y4);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
//        cal.add(Calendar.HOUR_OF_DAY, 4); // Adicionar +4 HORAS
//        y4 = cal.getTime();

//        System.out.println("DATA COM PADRÃO UTC: " + sdf3.format(y4));
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

        sc.close();
    }
}
