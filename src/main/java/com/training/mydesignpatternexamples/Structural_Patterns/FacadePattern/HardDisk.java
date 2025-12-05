package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

public class HardDisk implements Device {
    @Override
    public void start() {
        System.out.println("HardDisk: Spinning up and mounting filesystem.");
    }

    @Override
    public void stop() {
        System.out.println("HardDisk: Flushing buffers and spinning down.");
    }
}

