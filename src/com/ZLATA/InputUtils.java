package com.ZLATA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String askString(String msg) {
        System.out.println(msg + " ");
        return scanner.next();
    }
}
