package org.example.model;

import org.example.enums.ParkingSpotType;

public class ParkingSpot {
    private int id;
    private ParkingSpotType parkingSpotType;
    private boolean isEmpty;

    public ParkingSpot(int id, ParkingSpotType parkingSpotType) {
        this.id = id;
        this.parkingSpotType = parkingSpotType;
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void setOccupy() {
        this.isEmpty = false;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", parkingSpotType=" + parkingSpotType +
                ", isEmpty=" + isEmpty +
                '}';
    }
}