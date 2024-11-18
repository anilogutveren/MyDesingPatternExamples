package com.training.mydesignpatternexamples.Behavioral_Patterns.CommandDesignPattern;

public class CommandPatternExampleApp {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}