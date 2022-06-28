package lab6;

public class Truck extends Car
{
    void MAN()
    {
        String this.model = "TGX";
        String this.color = "white";
        String this.max_speed = 140;
    }

    public static void main(String[] args) 
    {
        Sidan objTruck = new Sedan();
        Car objCar = new Car();
        objTruck.MAN();
        System.out.println("Car: MAN\nModel " 
        + objTruck.model + 
        "\nColor: " + objTruck.color 
        + "\nMax speed " + objTruck.max_speed);
        objCar.gaz();
        objCar.brake();
    }
}
