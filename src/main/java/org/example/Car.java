package org.example;

public class Car {
    String make;
    String model;
    int year;
    double price;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year < 1886) {
            year = 1886;
        }
        this.year = year;
    }

    public void setPrice(double price) {
        if (price < 0) {
            price = 0.0;
        }
        this.price = price;
    }

    public double calculateDepreciation() {
        return this.price * Math.pow(0.85, 2025 - this.year);
    }

    public void print() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: " + this.price);
    }
}
