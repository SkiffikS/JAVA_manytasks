import java.util.Scanner;

public class task2_1
{
    public static void f(double x)
    {
        double x1 = (1 / x + Math.pow(Math.sin(x), 2) - Math.pow(Math.cos(1 + x * x), 1 / 3));
        double x2 = Math.log(Math.abs(Math.pow(Math.cos(x), 1 / 2) - Math.pow(Math.sin(x - 1), 1 / 3))) / Math.log(3);
        double x3 = Math.sqrt(Math.abs(x - 15));
        int n = 0;
        if(x1 < -3.5)
        {
            n++;
        }
        else 
        {
            System.out.println("condition 'x < -3.5' in the equation 1 is not met, x = " + x1);
        }
        if(x2 >= -3.5 & x <= 1)
        {
            n++;
        }
        else
        {
            System.out.println("condition '-3.5 <= x <= 1' in the equation 1 is not met, x = " + x2);
        }
        if(x3 > 1.1)
        {
            n++;
        }
        else 
        {
            System.out.println("condition 'x > 1.1' in the equation 1 is not met, x = " + x3);
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
        double x = scanner.nextDouble();
        f(x);
    }
}