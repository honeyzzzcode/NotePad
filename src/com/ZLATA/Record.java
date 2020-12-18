package com.ZLATA;

public abstract class Record {
    private static int counter = 0;

    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        return String.format("id: %d;", id);
    }
}
