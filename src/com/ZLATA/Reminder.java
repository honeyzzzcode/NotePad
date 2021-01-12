package com.ZLATA;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Scheduled {
    private LocalDate date;
    private boolean active = true;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public boolean isDue() {
        var tmp = LocalDateTime.of(getDate(), getTime());
        return active && LocalDateTime.now().isAfter(tmp);
    }

    @Override
    public void dismiss() {
        active = false;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s Date : %s", str, InputUtils.dateToString(date));
    }

    @Override
    public void askData() {
        super.askData();
        date = InputUtils.askDate("date");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.dateToString(date).toLowerCase().contains(substr)
                ;
    }
}


