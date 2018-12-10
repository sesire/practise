package House;

public class TestHouse {
    public static void main(String[] args){

        House myHouse = new House();

        myHouse.NumberOfBedRoom();
        String houseName = myHouse.getHouseName();
        System.out.println(houseName);

        House yourHouse = new House();
        yourHouse.NumberOfBedRoom();

        House sesireHouse = new House();
        sesireHouse.houseName = myHouse.getHouseName();
        System.out.println(houseName);



    }
}
