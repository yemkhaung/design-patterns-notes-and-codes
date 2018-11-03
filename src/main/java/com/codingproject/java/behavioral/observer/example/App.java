package com.codingproject.java.behavioral.observer.example;

import java.util.stream.IntStream;

/**
 * Demonstration of Observer design pattern
 * by providing communication between "Multiple-Threads"
 */
public class App {
    public static void main(String[] args) {

        // Here, our "BrokerFirm (Observers)" are running one MAIN thread
        BrokerFirm nyBroker = new BrokerFirm("New York Broker Firm");
        BrokerFirm laBroker = new BrokerFirm("Los Angles Broker Firm");
        StockMarket market = new StockMarket();
        market.registerObserver(nyBroker);
        market.registerObserver(laBroker);
        



        // updates from "StockMarket" are notified from SEPARATE threads
        Thread thread1 = new Thread(() -> {
            // Runnable implementation in Lambda expression
            StockMarket local = market;
            IntStream.range(1, 6)
                .forEach(i -> {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {}
                    local.stockUpdated(new Stock("GOOGL", i * 10.0));
                });

        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            // For now, "StockMarket" object is referenced from object in MAIN thread
            // OR > Runnable interface can be implemented in separate class and pass the "StockMarket"
            StockMarket local = market;
            IntStream.range(1, 6)
                .forEach(i -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    local.stockUpdated(new Stock("APPL", i * 8.0));
                });
        });
        thread2.start();


    }
}