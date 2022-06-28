import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("min: ");
        double min = scanner.nextDouble();
        System.out.print("max = ");
        double max = scanner.nextDouble();
        System.out.println("FOR: ");
        for(double x = 10; x <= 30; x++)
        {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if(y/10 >= min && y/10 <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y / 10);
            }
        }
        
        System.out.println("While: ");
        double x = 10;
        while(x <= 30)
        {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if(y/10 >= min && y/10 <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y / 10);
            }
            x++;
        }
    }
}
