package com.ZLATA;

public class Reminder extends Alarm{
    private String date;
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s Date : %s",str, date);
    }
    @Override
    public void askData() {
        super.askData();
        date = InputUtils.askString("date");
    }

}
