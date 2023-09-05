package org.example.model;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime dateTime;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.dateTime = LocalDateTime.now();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "dateTime=" + dateTime +
                ", parkingSpot=" + parkingSpot +
                ", vehicle=" + vehicle +
                '}';
    }
}