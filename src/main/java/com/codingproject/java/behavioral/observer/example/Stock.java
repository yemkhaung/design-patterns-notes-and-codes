package com.codingproject.java.behavioral.observer.example;

public class Stock {
    private String stockName;
    private Double stockPrice;

    public Stock() {
    }

    public Stock(String stockName, Double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getStockPrice() {
        return this.stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }
}