package ua.iot.lviv;

public  record ElevatorInObshchaga (int Price, float WeightInKg , double EnginePower  , int  CarryingCapacity , String Creator , String MaterialMadeOf) {
    private static  final boolean ElevatorExist = false;
    public ElevatorInObshchaga (){
        this (0,0,0.0,0,"none","wooden stick");
    }
    @Override
    public String toString(){
        return String.format("Price= %d , WeightInKg = %f , EnginePower = %f, CarryingCapacity=%d , Creator = %s , MaterialMadeOf = %s, ElevatorExist = %b ",  Price,WeightInKg ,
                EnginePower ,CarryingCapacity , Creator , MaterialMadeOf , ElevatorExist);
    }
}
