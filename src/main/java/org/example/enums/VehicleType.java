package org.example.enums;

import java.util.Arrays;
import java.util.List;

public enum VehicleType {
    CAR(Arrays.asList(ParkingSpotType.Large, ParkingSpotType.SMALL)),
    TRUCK(List.of(ParkingSpotType.Large));
    private List<ParkingSpotType> parkingSpotTypes;

    VehicleType(List<ParkingSpotType> parkingSpotTypes) {
        this.parkingSpotTypes = parkingSpotTypes;
    }


    public List<ParkingSpotType> getParkingSpotTypes() {
        return parkingSpotTypes;
    }
}
