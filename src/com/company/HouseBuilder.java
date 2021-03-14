package com.company;

public class HouseBuilder implements Builder{
    private Windows windows;

    private Rooms rooms;
    private Garage garage;
    private Garden garden;
    private Pool swimmingPool;
    private FancyStatue fancyStatue;

    @Override
    public void setWindows(Windows windows) {
        this.windows = windows;
    }



    @Override
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void setSwimmingPool(Pool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public void setFancyStatues(FancyStatue fancyStatue) {
        this.fancyStatue = fancyStatue;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public House getHouse() {
        return new House(windows, rooms, garden, garage, swimmingPool, fancyStatue);
    }
}
