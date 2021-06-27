package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Authorization {
    public static User user;
    private final UserService userService;
    private final ConsoleReader consoleReader;
    private final ConsoleWriter consoleWriter;

    public Authorization(UserService userService, ConsoleReader consoleReader, ConsoleWriter consoleWriter) {
        this.userService = userService;
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
    }

    public void authorization() {
        consoleWriter.write("ввеите логин и пароль");
        String login = consoleReader.readString();
        String password = consoleReader.readString();
        User byLogin = userService.getByLogin(login);
        if (byLogin.getPassword().equals(password)) {
            user = byLogin;
        }
    }
}
