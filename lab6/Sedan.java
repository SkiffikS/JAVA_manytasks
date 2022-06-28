package lab6;

public class Sedan extends Car 
{
    void BMW(String model, String color, int max_speed)
    {
        this.model = model;
        this.color = color;
        this.max_speed = max_speed;
    }

    public static void main(String[] args) 
    {
        Sidan objSidan = new Sedan("M5 Competicion", "black", 200);
        Car objCar = new Car();
        objSidan.BMW();
        System.out.println("Car: BMW\nModel: " 
        + objSidan.model + 
        "\nColor: " + objSidan.color 
        + "\nMax speed " + objSidan.max_speed);
        objCar.gaz();
    }
}
