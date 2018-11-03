package com.codingproject.java.behavioral.observer.example;

import com.codingproject.java.behavioral.observer.Observer;

public class BrokerFirm implements Observer<Stock> {

    private String brokerFirmName;

    public BrokerFirm(String brokerFirmName) {
        this.brokerFirmName = brokerFirmName;
    }

    public String getBrokerFirmName() {
        return this.brokerFirmName;
    }

    public void setBrokerFirmName(String brokerFirmName) {
        this.brokerFirmName = brokerFirmName;
    }

    @Override
    public void update(Stock stock) {
        this.processStock(stock);
    }

    private void processStock(Stock stock) {
        System.out.println(this.brokerFirmName + "'s stock updates. "
            + stock.getStockName() + ": " + stock.getStockPrice());
    }
}