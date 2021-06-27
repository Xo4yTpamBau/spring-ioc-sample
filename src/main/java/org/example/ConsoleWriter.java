package org.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    public void write(int number){
        System.out.println(number);
    }

    public void write(String message){
        System.out.println(message);
    }
}
