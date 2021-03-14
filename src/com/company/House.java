package com.company;

public class House {
    private Windows windows;
    private Rooms rooms;
    private Garden garden;
    private Garage garage;
    private Pool swimmingPool;
    private FancyStatue fancyStatue;

    public House(Windows windows,  Rooms rooms, Garden garden, Garage garage, Pool swimmingPool, FancyStatue fancyStatue) {
        this.windows = windows;

        this.rooms = rooms;
        this.garden = garden;
        this.garage = garage;
        this.swimmingPool = swimmingPool;
        this.fancyStatue = fancyStatue;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }


    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Pool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Pool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public FancyStatue getFancyStatue() {
        return fancyStatue;
    }

    public void setFancyStatue(FancyStatue fancyStatue) {
        this.fancyStatue = fancyStatue;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", rooms=" + rooms +
                ", garden=" + garden +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", fancyStatue=" + fancyStatue +
                '}';
    }
}
