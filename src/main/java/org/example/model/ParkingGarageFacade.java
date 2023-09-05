package org.example.model;

import org.example.enums.ParkingSpotType;
import org.example.enums.VehicleType;

import java.util.Arrays;
import java.util.List;

public class ParkingGarageFacade {
    private ParkingGarage parkingGarage;

    public ParkingGarageFacade() {
        List<ParkingSpot> parkingSpots = Arrays.asList(
                new ParkingSpot(1, ParkingSpotType.SMALL),
                new ParkingSpot(2, ParkingSpotType.SMALL),
                new ParkingSpot(3, ParkingSpotType.Large),
                new ParkingSpot(4, ParkingSpotType.Large),
                new ParkingSpot(5, ParkingSpotType.Large)
        );
        this.parkingGarage = new ParkingGarage(parkingSpots);
    }
    public void parkSomeCars(){
        this.parkingGarage.parkVehicle(new Vehicle("B23ROM", VehicleType.CAR));
        this.parkingGarage.parkVehicle(new Vehicle("B26ROM", VehicleType.CAR));
        this.parkingGarage.parkVehicle(new Vehicle("B21ROM", VehicleType.TRUCK));
        this.parkingGarage.parkVehicle(new Vehicle("B22ROM", VehicleType.CAR));
        this.parkingGarage.parkVehicle(new Vehicle("B20ROM", VehicleType.TRUCK));
    }
}
