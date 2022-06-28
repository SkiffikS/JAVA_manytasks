import java.util.Scanner;

public class t2
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("minimum =  ");
        double min = scanner.nextDouble();
        System.out.print("maximum = ");
        double max = scanner.nextDouble();
        System.out.println("FOR: ");
        for(double x = 1; x <= 3; x++)
        {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if (y >= min && y <= max) {
                System.out.println("x = " + x + "; y = " + y);
            }
        }
        
        System.out.println("While: ");
        double x = 1;
        while(x <= 3)
        {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if (y >= min && y <= max) {
                System.out.println("x = " + x + "; y = " + y);
            }
            x++;
        }
    }
}
