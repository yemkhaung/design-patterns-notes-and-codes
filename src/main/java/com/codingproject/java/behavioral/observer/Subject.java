package com.codingproject.java.behavioral.observer;

public interface Subject {
    public void registerObserver(Observer ob);
    public void unregisterObserver(Observer ob);
    public void nofifyObservers();
}