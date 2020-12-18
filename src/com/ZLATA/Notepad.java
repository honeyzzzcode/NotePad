package com.ZLATA;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createPerson() {
        var person = new Person();
        person.setFirstName(InputUtils.askString("First Name"));
        person.setLastName(InputUtils.askString("Last Name"));
        person.setPhone(InputUtils.askString("Phone"));
        person.setEmail(InputUtils.askString("Email"));
        records.add(person);
    }

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);

        }
    }

    public void createBook() {
        var book = new Book();
        book.setAuthor(InputUtils.askString("Author"));
        book.setTitle(InputUtils.askString("Title"));
        book.setIsbn(InputUtils.askString("ISBN"));
        records.add(book);
    }

    public void createStick() {
        var stick = new Sticker();
        stick.setText(InputUtils.askString("Text smthg:"));
        records.add(stick);
    }

    public void createAlarm() {
        var alarm = new Alarm();
        alarm.setTime(InputUtils.askString("Set time:"));
        alarm.setText(InputUtils.askString("Text smthg:"));
        records.add(alarm);
    }

    public void createReminder() {
        var reminder = new Reminder();
        reminder.setDate(InputUtils.askString("Set date"));
        reminder.setTime(InputUtils.askString("Set time"));

        reminder.setText(InputUtils.askString("Text smthg"));
        records.add(reminder);
    }

}
