package com.samsung;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner sc = new Scanner(System.in, encoding);
        PrintStream ps = new PrintStream(System.out, Boolean.parseBoolean(encoding));
        String text = sc.nextLine();
        ps.println(text);
    }

}
