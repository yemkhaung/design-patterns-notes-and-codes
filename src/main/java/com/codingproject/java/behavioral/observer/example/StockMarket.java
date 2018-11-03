package com.codingproject.java.behavioral.observer.example;

import java.util.ArrayList;
import java.util.List;

import com.codingproject.java.behavioral.observer.Observer;
import com.codingproject.java.behavioral.observer.Subject;

public class StockMarket implements Subject {

    private List<Observer<Stock>> brokers = new ArrayList<>();
    private Stock stockUpdate;

    @Override
    public void registerObserver(Observer ob) {
        this.brokers.add(ob);
    }

    @Override
    public void unregisterObserver(Observer ob) {
        this.brokers.remove(ob);
    }

    @Override
    public void nofifyObservers() {
        brokers.stream().forEach(ob -> ob.update(this.stockUpdate));
    }
    
    public void stockUpdated(Stock update) {
        System.out.println("Getting new stock updates...");
        this.stockUpdate = update;
        nofifyObservers();
    }

}