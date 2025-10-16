package com.example.autosalon;
import java.time.LocalDateTime;

public class Order {
    private Car car;
    private Client client;
    private LocalDateTime orderDate;
    private double finalPrice;

    public Order(Car car, Client client, double finalPrice) {
        this.car = car;
        this.client = client;
        this.orderDate = LocalDateTime.now();
        this.finalPrice = finalPrice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "car=" + car.getModel() +
                ", client=" + client.getName() +
                ", orderDate=" + orderDate +
                ", finalPrice=" + finalPrice +
                '}';
    }
}