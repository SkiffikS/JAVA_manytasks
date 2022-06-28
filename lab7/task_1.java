import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Car 
{
    String brand;
    int power;
    String driver;
    int price;
    int graduation_year;

    void Car(String brand, int power, String driver, int price, int graduation_year) 
    {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.graduation_year = graduation_year;
    }
}

class Driver 
{
    String name;
    int age;
    int experience;

    void Driver(String name, int age, int experience) 
    {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
}


class Helper 
{
    public int start(List cars) 
    {
        Random ran = new Random();
        int nxt = ran.nextInt(cars.size());
        return nxt;
    }
}


public class task_1
{
    public static void main(String[] args) 
    {
        Car BMW = new Car();
        BMW.brand = "BMW M2";
        BMW.power = 600;
        BMW.price = 200;
        BMW.graduation_year = 2010;

        Car Mercedes = new Car();
        Mercedes.brand = "Mercedes C-63";
        Mercedes.power = 250;
        Mercedes.price = 300;
        Mercedes.graduation_year = 2012;

        Car Mazda = new Car();
        Mazda.brand = "Mazda ZX-7";
        Mazda.power = 350;
        Mazda.price = 150;
        Mazda.graduation_year = 1998;

        Car Shkoda = new Car();
        Shkoda.brand = "Shkoda Octavia";
        Shkoda.power = 100;
        Shkoda.price = 200;
        Shkoda.graduation_year = 2006;

        Car Toyota = new Car();
        Toyota.brand = "Toyota Camry";
        Toyota.power = 350;
        Toyota.price = 300;
        Toyota.graduation_year = 2014;

        Car Mitsubishi = new Car();
        Mitsubishi.brand = "Mitsubishi Lancer";
        Mitsubishi.power = 370;
        Mitsubishi.price = 310;
        Mitsubishi.graduation_year = 2007;

        Car Nissan = new Car();
        Nissan.brand = "Nissan GTR";
        Nissan.power = 430;
        Nissan.price = 400;
        Nissan.graduation_year = 2008;

        Car Porsche = new Car();
        Porsche.brand = "Porsche Cain";
        Porsche.power = 270;
        Porsche.price = 350;
        Porsche.graduation_year = 2016;

        Car Deo = new Car();
        Deo.brand = "Deo Lanus";
        Deo.power = 80;
        Deo.price = 120;
        Deo.graduation_year = 2001;

        Car Audi = new Car();
        Audi.brand = "Audi A7";
        Audi.power = 315;
        Audi.price = 510;
        Audi.graduation_year = 2018;

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(BMW);
        cars.add(Mercedes);
        cars.add(Mazda);
        cars.add(Shkoda);
        cars.add(Toyota);
        cars.add(Mitsubishi);
        cars.add(Nissan);
        cars.add(Porsche);
        cars.add(Deo);
        cars.add(Audi);

        Driver Andrii = new Driver();
        Andrii.name = "Andrii";
        Andrii.age = 21;
        Andrii.experience = 3;

        Driver Vlad = new Driver();
        Vlad.name = "Vlad";
        Vlad.age = 32;
        Vlad.experience = 1;

        Driver Pavlo = new Driver();
        Pavlo.name = "Pavlo";
        Pavlo.age = 41;
        Pavlo.experience = 2;

        Driver Bogdan = new Driver();
        Bogdan.name = "Bogdan";
        Bogdan.age = 28;
        Bogdan.experience = 5;

        Driver Maxim = new Driver();
        Maxim.name = "Maxim";
        Maxim.age = 36;
        Maxim.experience = 10;

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(Andrii);
        drivers.add(Vlad);
        drivers.add(Pavlo);
        drivers.add(Bogdan);
        drivers.add(Maxim);

        // engine repair
        for(int i = 0; i < cars.size() / 2; i++)
        {
            int upgrade_car = cars.get(i).power + ((cars.get(i).power / 100) * 10);
            System.out.println("Upgrade power car " + cars.get(i).brand + ": " + cars.get(i).power + " -> " + upgrade_car + " horsepower");
            cars.get(i).power = upgrade_car;
        }

        cars.get(0).driver = Andrii.name;
        cars.get(1).driver = Vlad.name;
        cars.get(2).driver = Pavlo.name;
        cars.get(3).driver = Bogdan.name;
        cars.get(4).driver = Maxim.name;

        for(int i = 0; i < cars.size(); i = i + 2)
        {
            int car_power = cars.get(i).power + ((cars.get(i).power / 100) * 10);
            System.out.println("Upgrade power car " + cars.get(i).brand + ": " + cars.get(i).power + " -> " + car_power + " horsepower");
            cars.get(i).power = car_power;
            int car_price = cars.get(i).price + ((cars.get(i).price / 100) * 5);
            System.out.println("Price increase car " + cars.get(i).brand + ": " + cars.get(i).price + " -> " + car_price + " UAN");
            cars.get(i).price = car_price;
        }

        for(int i = 0; i < drivers.size(); i++)
        {
            if ((drivers.get(i).experience < 5) & (drivers.get(i).age > 25)) 
            {
                drivers.get(i).experience++;
                System.out.println("Driver " + drivers.get(i).name + " raised driving experience on courses");
            }
        }
        
        Helper driver_help = new Helper();
        int car_number = driver_help.start(cars);
        System.out.println("Car " + cars.get(car_number).brand + " with the driver " + cars.get(car_number).driver + " left for you");
        System.out.println("Driver " + cars.get(car_number).driver + " in place");
    }
}



