import java.util.Scanner;

public class t5_1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input id: ");
        int id = scanner.nextInt();
        System.out.print("input name: ");
        String name = scanner.nextLine();
        System.out.print("input price: ");
        double price = scanner.nextDouble();
        System.out.print("input term: ");
        int term = scanner.nextInt();

        Info data = new Info(id, name, price, term);
        Ware Pepsi = new Ware();

        Pepsi.setId(data.id);
        Pepsi.setName(data.name);
        Pepsi.setPrice(data.price);
        Pepsi.setWarrantyPeriod(data.term);

        System.out.println("Product information:" +
                "\nProduct ID: " + Pepsi.getId() +
                "\nProduct name: " + Pepsi.getName() +
                "\nProduct price: " + Pepsi.getPrice() +
                "\nProduct term: " + Pepsi.getWarrantyPeriod());
    }
}


class Info{

    int id;
    String name;
    double price;
    int term;

    Info(int id, String name, double price, int term) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.term = term;
    }
}

class Ware{

    private double id;
    private String name;
    private double price;
    private int term;

    void setId(int id) 
    {
        int ID = id;
        if (ID < 0) 
        {
            this.id = ID * -1;
            System.out.print("You may have made a mistake and entered a negative ID:" + ID + "\n" +
                    "We fixed this: " + this.id);
        }
        else
        {
            this.id = id;
        }
    }

    void setName(String name) 
    {
        this.name = name;
    }

    void setPrice(double price) 
    {
        if (price < 0) 
        {
            this.price = price * -1;
            System.out.print("You may have made a mistake and entered a negative price:" + price +
                    "\nWe fixed this: " + this.price);
        } 
        else 
        {
            this.price = price;
        }
    }

    void setWarrantyPeriod(int term){
        if (term < 0) {
            this.term = term * -1;
            System.out.print(
                    "You may have made a mistake and entered a negative warranty period:" + term + "\n" +
                            "We fixed this: " + this.term);
        } 
        else 
        {
            this.term = term;
        }
    }

    int getId(){return (int) this.id;}
    String getName(){return this.name;}
    double getPrice(){return this.price;}
    double getWarrantyPeriod(){return this.term;}
}
