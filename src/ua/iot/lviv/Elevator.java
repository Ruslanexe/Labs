package ua.iot.lviv;

public  record Elevator(int Price, float WeightInKg , double EnginePower  , int  CarryingCapacity , String Creator , String MaterialMadeOf) {

    private static final boolean ElevatorExist = true;
    private static final String ElevatorName = "Anton";

    public Elevator() {
        this(600, 20, 745.7, 1000, "Lux IS", "Metal");
    }

    public Elevator(float EnginePower, String Creator, String MaterialMadeOf) {
        this(300, 120, EnginePower, 1000, Creator, MaterialMadeOf);

    }

    @Override
    public String toString() {
        return String.format("Price= %d , WeightInKg = %f , EnginePower = %f, CarryingCapacity=%d , Creator = %s , MaterialMadeOf = %s, ElevatorExist = %b ", Price, WeightInKg,
                EnginePower, CarryingCapacity, Creator, MaterialMadeOf, ElevatorExist);

    }

    public static boolean ElevatorExist() {
        return ElevatorExist;
    }

    public static String ElevatorName()
    {
        return ElevatorName;
    }
}








