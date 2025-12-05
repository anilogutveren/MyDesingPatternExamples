package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

public class Bios implements Device {
    @Override
    public void start() {
        System.out.println("BIOS: System checks passed. Bootloader initialized.");
    }

    @Override
    public void stop() {
        System.out.println("BIOS: Persisting settings and shutting down firmware.");
    }
}

