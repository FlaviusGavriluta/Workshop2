package org.example.enums;

public enum ParkingSpotType {

    SMALL(9.99),
    Large(19.90);
    private final double price;

    ParkingSpotType(double price) {
        this.price = price;
    }
}
