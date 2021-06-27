package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class RootConfiguration {

//    @Bean
//    @Lazy
//    public User user(@Value("Test User") String name, Cat cat, Dog dog){
//        return new User(name, cat, dog);
//    }
//
//    @Bean
//    public String myName(){
//        return "Test";
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Cat cat(@Value("Test Cat") String name){
//        return new Cat(name);
//    }
//
//    @Bean
//    @Primary
//    public Cat cat2(@Value("Test Cat") String name){
//        return new Cat(name);
//    }
//
//    @Bean
//    public Dog dog(@Value("Test Dog") String name){
//        return new Dog(name);
//    }

//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public Calculator calculator(){
//        return null;
//    }
}
