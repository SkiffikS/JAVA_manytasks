import java.util.Scanner;

class task_5_9
{
    scanner in = new Scanner(System.in);
    System.out.printf("min = ");
    double min = in.nextDouble();
    System.out.printf("max = ");
    double max = in.nextDouble();
    System.out.println("FOR: ")
    for(double x = 10; x <= 30; x++)
    {
        double y = Math.sin(x * x) + Math.cos(x * x) - 10 * x;
        if(y >= min && y <= max)
        {
            System.out.println("x = " + x / 10 + "; y = " + y);
        }
    }
}