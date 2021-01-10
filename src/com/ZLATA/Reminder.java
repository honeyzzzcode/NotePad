package com.ZLATA;

import java.time.LocalDate;

public class Reminder extends Alarm {
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private LocalDate date;



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
