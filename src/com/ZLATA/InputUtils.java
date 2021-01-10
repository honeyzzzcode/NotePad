package com.ZLATA;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputUtils {
    public static final  String timeformat = "HH-mm";
    public static final DateTimeFormatter timeform = DateTimeFormatter.ofPattern(timeformat);

    public static final  String dateformat = "dd.MM.yyyy";
    public static final DateTimeFormatter dateform = DateTimeFormatter.ofPattern(dateformat);

    private static Scanner scanner = new Scanner(System.in);

    public static String askString(String msg) {
        System.out.println(msg + " ");
        return scanner.next();
    }

    public static int askInt(String message) {
        System.out.println(message + ":");
        return scanner.nextInt();


    }

    public static LocalTime askTime(String message) {
        System.out.println(message + "  " + timeformat );
        var strTime = scanner.next();
        return  LocalTime.parse(strTime, timeform);

    }
    public static String timeToString(LocalTime time){
        return timeform.format(time);

    }
    public static String dateToString(LocalDate date){
        return dateform.format(date);

    }

    public static LocalDate askDate(String message) {
        System.out.println(message +"   "+  dateformat );
        var strDate = scanner.next();
        return  LocalDate.parse(strDate, dateform);

    }
}
