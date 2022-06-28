package Yura.t2;
import java.util.Scanner;

public class t2_2 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input x: ");
        int x = scanner.nextInt();

        if(x == 12 | x > 0 & x < 3)
        {
            System.out.println("winter");
        }
        if(x > 2 & x < 6)
        {
            System.out.println("spring");
        }
        if(x > 5 & x < 9)
        {
            System.out.println("summer");
        }
        if(x > 8 & x < 12)
        {
            System.out.println("autumn");
        }
        if(x < 0 || x > 12)
        {
            System.out.println("Error");
        }
    }
}