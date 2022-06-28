//package lab6;
import java.util.ArrayList;
import java.util.Scanner;

public class Phone
{
    String name;
    //String model;
    //String weight;
    String number;

    //public static String receiveCall(String caller)
    //{
    //    String call = "call: " + caller;
    //    return call;
    //}

    //public static String getNumber(String Number)
    //{
    //    String num = "Number: " + Number;
    //    return num;
    //}

    void SetPhone(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    String receiveCall(String name, String number)
    {
        Phone xiaomi = new Phone();

        //String name = "Vlad";
        //String number = "380588332459";

        String res = "\n" + name + "\n" + number;

        return res;
    }

    static void sendMessage(int len)
    {
        int i = 0;
        ArrayList<String> where = new ArrayList<String>();
        while(i <= len)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("input number: ");
            String l = scanner.nextLine();
            where.add(l);
            i++;
        }

        System.out.println("Numbers: ");

        String[] stringArr = where.toArray( new String[] {} );
        for ( String element : stringArr ) 
        {
        System.out.println( element );
        }
    }

    //public Phone(String name, String model, String weight)
    //{
    //    this.number = name;
    //    this.model = model;
    //    this.weight = weight;
    //}

    //public Phone(String number, String model)
    //{
    //    this.number = number;
    //    this.model = model;
    //}

    //public Phone(){}

    public static void main(String[] args) 
    {
        sendMessage(5);
        //Phone x = new Phone();
        
        //System.out.println("Volume of Cone "+ x.receiveCall("Vlad", "380588332459"));
    


        //Phone apple = new Phone();
        //apple.name = "Iphone";
        //apple.model = " 11 pro";
        //apple.weight = " 150g";

        //Phone Samsung = new Phone();
        //Samsung.name = "S";
        //Samsung.model = " 21 ultra";
        //Samsung.weight = " 200g";

        //Phone LG = new Phone();
        //LG.name = "V";
        //LG.model = " 60+";
        //LG.weight = " 175g";

        //System.out.println("Phone1 " + apple.name + apple.model + apple.weight);
        //System.out.println(apple.receiveCall("Steve Jobs"));
        //System.out.println(apple.getNumber("+ 380 754 443 236"));
        //System.out.println("Phone2 " + Samsung.name + Samsung.model + Samsung.weight);
        //System.out.println(apple.receiveCall("Steve Jobs"));
        //System.out.println(apple.getNumber("+ 380 754 443 236"));
        //System.out.println("Phone3 " + LG.name + LG.model + LG.weight);
        //System.out.println(LG.receiveCall("Koo In-Hwoi"));
        //System.out.println(LG.getNumber("+ 380 342 465 236"));

    }
}
