package lab6;

public abstract class Car 
{
    public String model;
    public String color;
    public int max_speed;

    public static int gaz()
    {
        System.out.print("gas!");
        return 0;
    }

    public abstract int  brake()
    {
        System.out.print("brake!");
        return 0;
    }
}
