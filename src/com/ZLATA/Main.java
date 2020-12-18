package com.ZLATA;

public class Main {
    private static Notepad notepad = new Notepad();

    public static void main(String[] args) {


        boolean running = true;
        while (running) {
            var cmd = InputUtils.askString("Enter command: \n Possible commands : \n 1. create\n 2. list\n 3. help\n 4. exit");
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
        var type = InputUtils.askString("Type");
        switch (type) {
            case "person":
                notepad.createPerson();
                break;
            case "book":
                notepad.createBook();
                break;
            case "stick":
                notepad.createStick();
                break;
            case "alarm":
                notepad.createAlarm();
                break;
            case "reminder":
                notepad.createReminder();
                break;
            default:
                System.out.println("uknown type");

        }
    }

    private static void showHelp() {
        System.out.println("This is very helpful");
    }
}
