package Yura.t2;
import java.util.Scanner;

public class t2_1 
{
    public static void f(int x) 
    {
        double x1 = Math.pow(Math.E, 2*x);
        double x2 = Math.pow(Math.sin(3), 3) + Math.pow(Math.cos(x - 3), 3);
        double x3 = x * x - 3 * x + 1;
        int n = 0;
        if (x1 < -3)
        {
            n ++;
        }
        else
        {
            System.out.println("condition 'x < -3' in the equation 1 is not met, x = " + x1);
        }

        if (-3 <= x2 & x2 <= 3)
        {
            n ++;
        }
        else
        {
            System.out.println("condition '-3 <= x <= 3' in the equation 2 is not met, x = " + x2);
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
