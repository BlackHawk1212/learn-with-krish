public class HouseBuilder {

    private int noOfDoors;
    private int noOfWindows;
    private int noOfRooms;
    private int noOfBathrooms;

    public HouseBuilder setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
        return this;
    }

    public HouseBuilder setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
        return this;
    }

    public HouseBuilder setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
        return this;
    }

    public HouseBuilder setNoOfBathrooms(int noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
        return this;
    }

    public House buildHouse(){
        return new House(noOfDoors, noOfWindows, noOfRooms, noOfBathrooms);
    }

}