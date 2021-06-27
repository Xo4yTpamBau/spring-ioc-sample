package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Registration {

    @Autowired
    UserService userService;

    @Autowired
    ConsoleWriter consoleWriter;

    @Autowired
    ConsoleReader consoleReader;

    public void save(){
        consoleWriter.write("ввеите логин и пароль");
        String login = consoleReader.readString();
        String password = consoleReader.readString();
        userService.save(new User(login, password));
    }
}

