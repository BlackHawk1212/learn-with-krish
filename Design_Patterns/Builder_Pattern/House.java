public class House {

    private int noOfDoors;
    private int noOfWindows;
    private int noOfRooms;
    private int noOfBathrooms;

    public House(int noOfDoors, int noOfWindows, int noOfRooms, int noOfBathrooms) {
        super();
        this.noOfDoors = noOfDoors;
        this.noOfWindows = noOfWindows;
        this.noOfRooms = noOfRooms;
        this.noOfBathrooms = noOfBathrooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "noOfDoors=" + noOfDoors +
                ", noOfWindows=" + noOfWindows +
                ", noOfRooms=" + noOfRooms +
                ", noOfBathrooms=" + noOfBathrooms +
                '}';
    }

}