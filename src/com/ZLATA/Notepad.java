package com.ZLATA;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();
    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);
        }
    }
    public void createRecord(RecordType recType) {
        var rec = recType.createRecord();
        rec.askData();
        records.add(rec);
        System.out.println("CREATED:   " + rec);
    }

}
