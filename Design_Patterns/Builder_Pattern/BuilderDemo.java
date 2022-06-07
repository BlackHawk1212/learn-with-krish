public class BuilderDemo {
    public static void main(String[] args){

        //Build House 1
        House house1 = new HouseBuilder().setNoOfDoors(3).setNoOfWindows(10).setNoOfRooms(4).setNoOfBathrooms(2).buildHouse();
        System.out.println(house1);

        //Build House 2
        House house2 = new HouseBuilder().setNoOfDoors(2).setNoOfWindows(8).setNoOfRooms(3).setNoOfBathrooms(1).buildHouse();
        System.out.println(house2);

    }
}