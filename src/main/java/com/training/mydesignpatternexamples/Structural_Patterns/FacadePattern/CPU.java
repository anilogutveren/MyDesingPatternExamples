package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

public class CPU implements Device {
    @Override
    public void start() {
        System.out.println("CPU: Starting execution pipeline.");
    }

    @Override
    public void stop() {
        System.out.println("CPU: Flushing caches and halting.");
    }
}

