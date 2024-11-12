package com.training.mydesignpatternexamples.Creational_Patterns.BuilderPattern;

public class PersonBuilder {

    String name;
    int age;
    String phone;

    // Setter methods for chaining
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    // Build method to return the final Person object
    public Person build() {
        return new Person(this);
    }
}
