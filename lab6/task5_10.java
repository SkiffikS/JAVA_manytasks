import java.util.Scanner;

public class task5_10 
{
    String city;
    String street;
    int house;
    int apartment;
    int parcels_number;
    int price;

    void task5_10(String city, String street, int house, int apartment, int parcels_number, int price)
    {
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
        this.parcels_number = parcels_number;
        this.price = price;
    }

    void output_data(String city, String street, int house, int apartment, int parcels_number, int price)
    {
        System.out.println("city: " + city + "\nstreet: " + street + "\nhouse: " + house + "\napartment: " + apartment
                + "\nnumber parcels: " + parcels_number + "\nprice: " + price);
    }
    
    void sum_data(int parcels_number, int price)
    {
        System.out.println("Sum:\nparcels - " + parcels_number + " pieces\nprice " + (parcels_number * price) + "UAN");
    }

    public static void main(String[] args) 
    {
        task5_10 data = new task5_10();
        Scanner in = new Scanner(System.in);
        System.out.print("Input city: ");
        data.city = in.nextLine();
        System.out.print("Input street: ");
        data.street = in.nextLine();
        System.out.print("Input house: ");
        data.house = in.nextInt();
        System.out.print("Input apartment: ");
        data.apartment = in.nextInt();
        System.out.print("Input number parcels: ");
        data.parcels_number = in.nextInt();
        System.out.print("Input price: ");
        data.price = in.nextInt();
        data.output_data(data.city, data.street, data.house, data.apartment, data.parcels_number, data.price);
        data.sum_data(data.parcels_number, data.price);
    }
}
