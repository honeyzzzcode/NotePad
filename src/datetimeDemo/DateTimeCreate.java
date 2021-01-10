package datetimeDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeCreate {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("current date:" + currentDate);

        var currentTime = LocalTime.now();
        System.out.println("current time " + currentTime);

        var  currentDateTime = LocalDateTime.now();
        System.out.println("current date time:" + currentDateTime);

        var myBD = LocalDate.of(2000, Month.DECEMBER,15);
        System.out.println("My BD  " + myBD);
        var lessonStart = LocalTime.of(18,30);
        System.out.println(""+ lessonStart);
        var firstlesson = LocalDateTime.of(2019,12,23,18,30);
        System.out.println("firstlesson  " + firstlesson);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        var strDate = "07.12.2020";
        var date = LocalDate.parse(strDate,formatter);
        System.out.println("date:" + date);
        var datetimeform = DateTimeFormatter.ofPattern("dd MMMM uuuu @ HH:mm");
        var dt = LocalDateTime.of(currentDate, lessonStart);
        var strDT = datetimeform.format(dt);
        System.out.println(strDT);

        var dt1 = currentDate.atTime(lessonStart);
        System.out.println(dt1);
        var dt2 = dt1.plusMinutes(576);
        System.out.println(dt2);
    }
}
