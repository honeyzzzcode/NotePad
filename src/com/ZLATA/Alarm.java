package com.ZLATA;

public class Alarm extends StickyNote {
    private String time;
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s Time: %s",str,time);
    }
    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askString("time");
    }

}
