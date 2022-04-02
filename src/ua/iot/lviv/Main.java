package ua.iot.lviv;

public class Main {


    public static void main(String[] args) {
        Elevator c1 = new Elevator(),
                c2 = new Elevator(400,"Lux MR", "Stone" ),
                c3 = new Elevator(400 , 140 , 1200.7 , 20000 ,"Izamet Classic", "Metal");
      ElevatorInObshchaga c4 = new ElevatorInObshchaga();
        System.out.println(Elevator.ElevatorExist());
        System.out.println(Elevator.ElevatorName());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


    }

}