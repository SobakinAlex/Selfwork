package com.samsung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        String string = sc.next();
        char[] charArray = string.toCharArray();
        char[] alphabet ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        cezar(charArray, key, alphabet);
        System.out.println(charArray);
    }

    public static char[] cezar(char[] charArray, int key, char[] alphabet) {
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = alphabet[(alphabet.prototype.findIndex(charArray[i]) + key) % 26];
        }
        return charArray;
    }
}
