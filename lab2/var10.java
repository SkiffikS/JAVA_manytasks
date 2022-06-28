package lab2;
import java.util.Scanner;

public class var10
{
    public static void f(int x) 
    {
        double x1 = Math.pow((x * x + 3), 0.2);
        double x2 = Math.acos(x) + 5;
        double x3 = -x + Math.log(x);
        int n = 0;
        if (x1 < 0)
        {
            n ++;
        }
        else
        {
            System.out.println("condition 'x < 0' in the equation 1 is not met, x = " + x1);
        }

        if (0 <= x2 & x2 <= 3)
        {
            n ++;
        }
        else
        {
            System.out.println("condition '0 <= x <= 3' in the equation 2 is not met, x = " + x2);
        }

        if (x3 > 3)
        {
            n ++;
        }
        else
        {
            System.out.println("condition 'x > 3' in the equation 3 is not met, x = " + x3);
        }
        if (n == 3)
        {
            System.out.println("the equation is solved");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input x: ");
        int x = scanner.nextInt();
        f(x);
    }
}
