package com.training.mydesignpatternexamples.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * Observer Pattern
 * Actually we do not have to create Observer and Observable classes.
 * java utils package has these classes already.
 * @author Anil Ogutveren
 * */
public abstract class Observable {

    private List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void ekle(Observer observer){
        observerList.add(observer);
    }

    public void cikar(Observer observer){
        observerList.remove(observer);
    }

    public void sendNotification(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
