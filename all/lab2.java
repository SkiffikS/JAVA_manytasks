import java.util.Scanner;

class Main
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

    public static void converter(int n, int S)
    {
        switch (n)
        {
            case 1:
                System.out.println(S + " centimeter - " + S * Math.pow(10, -5) + " kilometers");
                break;
            case 2:
                System.out.println(S + " millimeter - " + S * Math.pow(10, -6) + " kilometers");
                break;
            case 3:
                System.out.println(S + " decimetre - " + S * Math.pow(10, -4) + " kilometers");
                break;
            case 4:
                System.out.println(S + " mete - " + S * Math.pow(10, -3) + " kilometers");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}


public class lab2 
{
    public static void main(String[] args) 
    {
        Main lab_2_functions = new Main();
        System.out.println("[info] Task-1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("input x: ");
        double x = scanner.nextDouble();
        lab_2_functions.f(x);
        System.out.println("[info] Task-2");
        System.out.println("Select the unit of distance");
        System.out.println("1 - centimeter\n2 - millimeter\n3 - decimetre\n4 - meter");
        System.out.print("input number(index unit): ");
        int n = scanner.nextInt();
        System.out.print("S = ");
        int S = scanner.nextInt();
        lab_2_functions.converter(n, S);
    }
}