import java.util.Scanner;

public class t3_2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("min: ");
        double min = scanner.nextDouble();
        System.out.print("max = ");
        double max = scanner.nextDouble();

        System.out.println("FOR: ");
        for(double x = 0; x <= 20; x++)
        {
            double y = Math.sin(x) - (1/3 * Math.cos(Math.pow(x, 1/5)));
            if(y >= min && y <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y);
            }
        }

        System.out.println("While: ");
        min = min * 10;
        max = max * 10;
        double x = 0;

        while(x <= 20)
        {
            double y = Math.sin(x) - (1 / 3 * Math.cos(Math.pow(x, 1 / 5)));
            if(y >= min && y <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y);
            }
            x++;
        }
    }
}
