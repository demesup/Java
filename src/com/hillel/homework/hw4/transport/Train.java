package com.hillel.homework.hw4.transport;

public class Train extends Transport {
    private boolean railways;
    private boolean depot;
    private int wagons;

    private long cargoWeight;

    public Train(long capacity, long speed, String departure, String arrival, String origin, String destination,
                 int customs, boolean railways, boolean depot, int wagons) {
        super(capacity, speed, departure, arrival, origin, destination, customs);
        this.railways = railways;
        this.depot = depot;
        this.wagons = wagons;
    }

    @Override
    public String toString() {

        if (railways && depot) {
            return "Train: " +
                    "speed: " + getSpeed() +
                    "km/h \n\t departure:" + getDeparture() +
                    "\n\t arrival: " + getArrival() +
                    "\n\t origin: " + getOrigin() +
                    "\n\t destination: " + getDestination() +
                    "\n\t customs: " + getCustoms() +
                    "\n\t max capacity of a wagon : " + getCapacity() +
                    " tons \n\t max wagons: " + wagons +
                    "\n\t max cargo weight: " + getCargoWeight() + " tons";
        }
        return "Make sure there are railways and depot";
    }

    public void hum() {
        System.out.println("The train is humming...");
    }

    public void rails() {
        System.out.println("The train is changing rails...");
    }

    public long getCargoWeight() {
        return this.getCapacity() * wagons;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public boolean isRailways() {
        return railways;
    }

    public void setRailways(boolean railways) {
        this.railways = railways;
    }

    public boolean isDepot() {
        return depot;
    }

    public void setDepot(boolean depot) {
        this.depot = depot;
    }

}
