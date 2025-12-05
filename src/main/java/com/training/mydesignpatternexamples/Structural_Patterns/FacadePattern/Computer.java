package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

// Facade that orchestrates the startup and shutdown sequences of computer subsystems
public class Computer {

    private final Bios bios;
    private final CPU cpu;
    private final Ram ram;
    private final HardDisk hardDisk;
    private final Monitor monitor;

    public Computer() {
        this.bios = new Bios();
        this.cpu = new CPU();
        this.ram = new Ram();
        this.hardDisk = new HardDisk();
        this.monitor = new Monitor();
    }

    // Optionally allow dependency injection for testing or custom configurations
    public Computer(Bios bios, CPU cpu, Ram ram, HardDisk hardDisk, Monitor monitor) {
        this.bios = bios;
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
    }

    public void powerOn() {
        System.out.println("Computer: Powering on...");
        bios.start();
        ram.start();
        hardDisk.start();
        cpu.start();
        monitor.start();
        System.out.println("Computer: System is up and running.\n");
    }

    public void powerOff() {
        System.out.println("Computer: Powering off...");
        monitor.stop();
        cpu.stop();
        hardDisk.stop();
        ram.stop();
        bios.stop();
        System.out.println("Computer: System shut down complete.\n");
    }
}

