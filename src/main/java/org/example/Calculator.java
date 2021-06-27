package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Lazy
@Primary
@Scope("prototype")
public class Calculator implements BeanNameAware, BeanFactoryAware {

    //field
    //constructor
    //setter

    //java base
    //annotation
    //xml

    private final ConsoleWriter consoleWriter;
    private final ConsoleReader consoleReader;
    private final History history;
    private Registration registration;
    private Authorization authorization;

    private String myName;
    private BeanFactory beanFactory;

    public Calculator(ConsoleWriter consoleWriter, ConsoleReader consoleReader, History history) {
        this.consoleWriter = consoleWriter;
        this.consoleReader = consoleReader;
        this.history = history;
    }

//    @Autowired
    public Calculator(ConsoleWriter consoleWriter, ConsoleReader consoleReader, History history, Registration registration, Authorization authorization) {
        this.consoleWriter = consoleWriter;
        this.consoleReader = consoleReader;
        this.history = history;
        this.registration = registration;
        this.authorization = authorization;
    }

//    @Autowired
//    public void setRegistration(Registration registration) {
//        this.registration = registration;
//    }

    @PostConstruct
    public void init(){
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }

    public void run() {
        while (true) {
            beanFactory.getBean("user")
            User user = Authorization.user;
            if (user == null) {
                consoleWriter.write("Выберите 1 - регистрация 2 - авторизаця 3 - exit");
                int i = consoleReader.readInt();
                switch (i) {
                    case 1:
                        registration.save();
                        break;
                    case 2:
                        authorization.authorization();
                        break;
                    case 3:
                        return;
                }
            } else {
                while (true) {
                    consoleWriter.write("Введите операцию 1 - sum 2 - sub 3 - div  4 - mod 5 - exit 6 - history");
                    int i2 = consoleReader.readInt();
                    consoleWriter.write("Введите 2 числа ");
                    int i = consoleReader.readInt();
                    int i1 = consoleReader.readInt();
                    switch (i2) {
                        case 1:
                            consoleWriter.write(i + i1);
                            history.save(i + i1);
                            break;
                        case 2:
                            consoleWriter.write(i - i1);
                            history.save(i - i1);
                            break;
                        case 3:
                            consoleWriter.write(i / i1);
                            history.save(i / i1);
                            break;
                        case 4:
                            int number = i * i1;
                            consoleWriter.write(number);
                            history.save(number);
                            break;
                        case 5:
                            return;
                        case 6:
                            for (Integer integer : history.getAll()) {
                                consoleWriter.write(integer);
                            }
                    }
                }
            }
        }

    }

    @Override
    public void setBeanName(String s) {
        this.myName = s;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
