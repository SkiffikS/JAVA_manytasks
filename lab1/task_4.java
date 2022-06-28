// create class
public class task_4 
{
    // create function
    public static void main(String[] args) 
    {
        // ask cars info
        int Car_0_power = 420;
        float Car_0_EngineCapacity = 3.2f;
        float Car_0_FuelConsumption = 22.5f;
        long Car_0_Run = 120 * 10^3;
        long Car_0_Price = 200 * 10^3;
        long Car_0_Mass = 1825;
        int Car_0_MaximumSpeed = 220;

        int Car_1_power = 510;
        float Car_1_EngineCapacity = 4.0f;
        float Car_1_FuelConsumption = 25.0f;
        long Car_1_Run = 100 * 10^3;
        long Car_1_Price = 300 * 10^3;
        long Car_1_Mass = 2000;
        int Car_1_MaximumSpeed = 260;

        int Car_2_power = 390;
        float Car_2_EngineCapacity = 2.9f;
        float Car_2_FuelConsumption = 15.5f;
        long Car_2_Run = 200 * 10^3;
        long Car_2_Price = 120 * 10^3;
        long Car_2_Mass = 1600;
        int Car_2_MaximumSpeed = 200;

        int Car_3_power = 60;
        float Car_3_EngineCapacity = 1.9f;
        float Car_3_FuelConsumption = 6.2f;
        long Car_3_Run = 90 * 10^3;
        long Car_3_Price = 80 * 10^3;
        long Car_3_Mass = 980;
        int Car_3_MaximumSpeed = 180;

        int Car_4_power = 384;
        float Car_4_EngineCapacity = 2.8f;
        float Car_4_FuelConsumption = 13.5f;
        long Car_4_Run = 160 * 10^3;
        long Car_4_Price = 160 * 10^3;
        long Car_4_Mass = 1800;
        int Car_4_MaximumSpeed = 200;

        int Car_5_power = 360;
        float Car_5_EngineCapacity = 3.0f;
        float Car_5_FuelConsumption = 17.5f;
        long Car_5_Run = 150 * 10^3;
        long Car_5_Price = 180 * 10^3;
        long Car_5_Mass = 1650;
        int Car_5_MaximumSpeed = 200;

        int Car_6_power = 260;
        float Car_6_EngineCapacity = 2.2f;
        float Car_6_FuelConsumption = 14.5f;
        long Car_6_Run = 120 * 10^3;
        long Car_6_Price = 130 * 10^3;
        long Car_6_Mass = 1580;
        int Car_6_MaximumSpeed = 200;

        int Car_7_power = 600;
        float Car_7_EngineCapacity = 4.0f;
        float Car_7_FuelConsumption = 25.5f;
        long Car_7_Run = 180 * 10^3;
        long Car_7_Price = 260 * 10^3;
        long Car_7_Mass = 1220;
        int Car_7_MaximumSpeed = 280;

        int Car_8_power = 120;
        float Car_8_EngineCapacity = 1.8f;
        float Car_8_FuelConsumption = 10.5f;
        long Car_8_Run = 310 * 10^3;
        long Car_8_Price = 120 * 10^3;
        long Car_8_Mass = 980;
        int Car_8_MaximumSpeed = 180;

        int Car_9_power = 1200;
        float Car_9_EngineCapacity = 6.0f;
        float Car_9_FuelConsumption = 50.0f;
        long Car_9_Run = 80 * 10^3;
        long Car_9_Price = 500 * 10^3;
        long Car_9_Mass = 800;
        int Car_9_MaximumSpeed = 324;

        // sum power all cars
        long sum_cars_power = Car_0_power + Car_1_power + Car_2_power +
        Car_3_power + Car_4_power + Car_5_power + Car_6_power + Car_7_power +
        Car_8_power + Car_9_power;
        
        // sum engine capacity all cars
        double sum_cars_EngineCapacity = Car_0_EngineCapacity + Car_1_EngineCapacity +
        Car_2_EngineCapacity + Car_3_EngineCapacity + Car_4_EngineCapacity + 
        Car_5_EngineCapacity + Car_6_EngineCapacity + Car_7_EngineCapacity +
        Car_8_EngineCapacity + Car_9_EngineCapacity;

        // sum fuel consumption all cars
        double sum_cars_FuelConsumption = Car_0_FuelConsumption + Car_1_FuelConsumption +
        Car_2_FuelConsumption + Car_3_FuelConsumption + Car_4_FuelConsumption + 
        Car_5_FuelConsumption + Car_6_FuelConsumption + Car_7_FuelConsumption +
        Car_8_FuelConsumption + Car_9_FuelConsumption;

        // sum cars run
        long sum_cars_Run = Car_0_Run + Car_1_Run + Car_2_Run + Car_3_Run +
        Car_4_Run + Car_5_Run + Car_6_Run + Car_7_Run + Car_8_Run + Car_9_Run;

        // sum cars price
        long sum_cars_Price = Car_0_Price + Car_1_Price + Car_2_Price + Car_3_Price +
        Car_4_Price + Car_5_Price + Car_6_Price + Car_7_Price + Car_8_Price + Car_9_Price;

        // sum cars mass
        long sum_cars_Mass = Car_0_Mass + Car_1_Mass + Car_2_Mass + Car_3_Mass +
        Car_4_Mass + Car_5_Mass + Car_6_Mass + Car_7_Mass + Car_8_Mass + Car_9_Mass;

        // sum max speed all cars
        int sum_cars_MaximumSpeed = Car_0_MaximumSpeed + Car_1_MaximumSpeed +
        Car_2_MaximumSpeed + Car_3_MaximumSpeed + Car_4_MaximumSpeed + 
        Car_5_MaximumSpeed + Car_6_MaximumSpeed + Car_7_MaximumSpeed +
        Car_8_MaximumSpeed + Car_9_MaximumSpeed;

        // print all
        System.out.printf("sum power of machines = %d\n", sum_cars_power);
        System.out.printf("sum engine volumes of machines = %.2f\n", sum_cars_EngineCapacity);
        System.out.printf("sum fuel consumption of machines = %.2f\n", sum_cars_FuelConsumption);
        System.out.printf("sum run cars = %d\n", sum_cars_Run);
        System.out.printf("full cars price = %d\n", sum_cars_Price);
        System.out.printf("full mass cars = %d\n", sum_cars_Mass);
        System.out.printf("sum speed cars = %d\n", sum_cars_MaximumSpeed);
    }
}
