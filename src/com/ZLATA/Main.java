package com.ZLATA;

import enumDemo.TrafficLight;

public class Main {
    private static Notepad notepad = new Notepad();

    public static void main(String[] args) {


        boolean running = true;
        while (running) {
            var cmd = InputUtils.askString("Enter command: \n");
            switch (cmd) {
                case "list":
                    listRecords();
                    break;
                case "create":
                    createRecord();
                    break;
                case "help":
                    showHelp();
                    break;
                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Uknown command");
            }
        }
        System.out.println("Bye Bye");
    }

    private static void listRecords() {
        notepad.listRecords();
    }

    private static void createRecord() {
        var strtype = InputUtils.askString("Type");
        var type = RecordType.valueOf(strtype);
        notepad.createRecord(type);
    }

    private static void showHelp() {
        System.out.print("Possible commands : create \n list \nhelp \nexit\n Possible types:  ");
        for (RecordType l : RecordType.values()) {

            System.out.println(l);
        }
    }
}
