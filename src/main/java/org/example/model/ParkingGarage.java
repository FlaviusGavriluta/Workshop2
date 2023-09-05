package org.example.model;

import org.example.enums.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;

public class ParkingGarage {
    private List<ParkingSpot> parkingSpots;
    private List<Ticket> tickets;

    public ParkingGarage(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
        this.tickets = new ArrayList<>();
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingSpotType parkingSpotType : vehicle.getVehicleType().getParkingSpotTypes()) {
            ParkingSpot parkingPlace = parkingSpots.stream()
                    .filter(ParkingSpot::isEmpty)
                    .filter(parkingSpot -> parkingSpot.getParkingSpotType()
                            .equals(parkingSpotType))
                    .findFirst()
                    .orElse(null);
            if (parkingPlace != null) {
                parkingPlace.setOccupy();
                Ticket ticket = new Ticket(parkingPlace, vehicle);
                System.out.println(ticket);
                return ticket;
            }
        }
        return null;
    }
}
