package com.training.mydesignpatternexamples.Behavioral_Patterns.CommandDesignPattern;

/**
 * Concrete Command
 * README dosyasini oku
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
