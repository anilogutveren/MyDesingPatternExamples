package com.training.mydesignpatternexamples.CreationalPatterns.BuilderPattern;

public class Person {

    private String name;
    private int age;
    private String phone;

    // Private constructor to prevent direct instantiation
    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", phone='" + phone + "'}";
    }
}
