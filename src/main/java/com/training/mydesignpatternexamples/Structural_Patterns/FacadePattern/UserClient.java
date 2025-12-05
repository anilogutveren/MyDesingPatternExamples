package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

// Simple client to demonstrate use of the Facade
public class UserClient {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        // Simulate some work...
        System.out.println("UserClient: Doing some work...");

        computer.powerOff();
    }
}

