package lab3;
import java.util.Scanner;

class task_5_9
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("min: ");
        double min = scanner.nextDouble();
        System.out.print("max = ");
        double max = scanner.nextDouble();
        /**
        System.out.println("FOR: ");
        for(double x = 10; x <= 30; x++)
        {
            double y = Math.sin(x * x) + Math.cos(x * x); //- 10 * x;
            if(y >= min && y <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y);
            }
        }
        */
        System.out.println("While: ");
        min = min * 10;
        max = max * 10;
        double x = 10;
        while(x <= 30)
        {
            double y = Math.sin(x * x) + Math.cos(x * x); //- 10 * x;
            if(y >= min && y <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y);
            }
            x++;
        }
    }
}
