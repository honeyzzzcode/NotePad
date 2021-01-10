package com.ZLATA;

import java.time.LocalTime;

public class Alarm extends StickyNote {
    private LocalTime time;
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }





    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s Time: %s",str,InputUtils.timeToString(time));
    }
    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askTime("time");
    }
    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.timeToString(time).toLowerCase().contains(substr)
                ;
    }
}

