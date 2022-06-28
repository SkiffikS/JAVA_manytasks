
import java.util.Scanner;
import java.io.*;

public class task_2 {
    static void quadrant(int x, int y)
    {
        if (x > 0 && y > 0)
            System.out.println("lies in First quadrant");
 
        else if (x < 0 && y > 0)
            System.out.println("lies in Second quadrant");
 
        else if (x < 0 && y < 0)
            System.out.println("lies in Third quadrant");
 
        else if (x > 0 && y < 0)
            System.out.println("lies in Fourth quadrant");
 
        else if (x == 0 && y > 0)
            System.out.println("lies at positive y axis");
 
        else if (x == 0 && y < 0)
            System.out.println("lies at negative y axis");
 
        else if (y == 0 && x < 0)
            System.out.println("lies at negative x axis");
 
        else if (y == 0 && x > 0)
            System.out.println("lies at positive x axis");
 
        else
            System.out.println("lies at origin");
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input x: ");
        int x = scanner.nextInt();
        System.out.print("input y: ");
        int y = scanner.nextInt();
        quadrant(x, y);
    }
}
