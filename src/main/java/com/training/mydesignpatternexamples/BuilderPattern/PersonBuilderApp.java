package com.training.mydesignpatternexamples.BuilderPattern;

public class PersonBuilderApp {

    public void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Alice")
                .setAge(30)
                .setPhone("123-456-7890")
                .build();

        System.out.println(person);
    }
}
