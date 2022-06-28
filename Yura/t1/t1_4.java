package Yura.t1;


class goods 
{
    String name;
    double price;
    int term;

    goods(String name, double price, int term)
    {
        this.name = name;
        this.price = price;
        this.term = term;
    }
}

public class t1_4 
{

    public static void main(String[] args) 
    {
        goods t1 = new goods("milk", 30, 10);
        goods t2 = new goods("bread", 20, 2);
        goods t3 = new goods("eggs", 1.5, 30);
        goods t4 = new goods("flour", 50, 90);
        goods t5 = new goods("meat", 110, 7);

        System.out.println("Goods '" + t1.name + "', price - " + t1.price + "UAN; term: " + t1.term + " day");
        System.out.println("Goods '" + t2.name + "', price - " + t2.price + "UAN; term: " + t2.term + " day");
        System.out.println("Goods '" + t3.name + "', price - " + t3.price + "UAN; term: " + t3.term + " day");
        System.out.println("Goods '" + t4.name + "', price - " + t4.price + "UAN; term: " + t4.term + " day");
        System.out.println("Goods '" + t5.name + "', price - " + t5.price + "UAN; term: " + t5.term + " day");
        System.out.println("Average price: " + (t1.price + t2.price + t3.price + t4.price + t5.price)/5 + "UAN");
    }
}
