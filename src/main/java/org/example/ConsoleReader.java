package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    public int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String readString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
