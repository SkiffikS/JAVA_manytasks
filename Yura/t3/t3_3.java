
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class t3_3 
{
    public static void main(String[] args) 
    {
        Menu menu = new Menu();
        menu.action(menu.typeOfAction());
    }
}

class Menu 
{
    Scanner input = new Scanner(System.in);
    int t;

    int typeOfAction() 
    {
        System.out.print("Choose what you want : \n" +
                        "1. Turn on the timer\n" +
                        "2. Find the value of the function ( f(x) = sin x - 1/3 * cos x ^ 1/5 )\n");
        t = input.nextInt();
        return t;
    }

    void action(int t) {
        if (t == 1) 
        {
            Timepiece clock = new Timepiece();
            clock.gain();
        }
        else if (t == 2) 
        {
            Calculate calc = new Calculate();
            calc.input();
            calc.output(calc.seach());
        } 
        else 
        {
            System.out.println("Error");
        }
    }
}

class Timepiece {

    byte s;
    byte m;
    byte h;

    int gain() 
    {
        for (s = 0;;) 
        {
            try 
            {
                TimeUnit.SECONDS.sleep(1);
                s += 1;
                if (s == 60) 
                {
                    s = 0;
                    m += 1;
                }
                if (m == 60) 
                {
                    m = 0;
                    h += 1;
                }
                if (h == 24) 
                {
                    h = 0;
                }
                System.out.printf("%dh %dm %ds\n", h, m, s);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Error: " + e);
            }
        }
    }
}

class Calculate {

    int start;
    int end;
    int b;
    double func;
    int times;
    Scanner in = new Scanner(System.in);

    void input() 
    {
        System.out.printf("Enter the lower bound: \n");
        start = in.nextInt();
        System.out.printf("Enter the upper bound: \n");
        end = in.nextInt();
        if (end < start) {
            b = start;
            start = end;
            end = b;
        }
    }

    int seach() 
    {
        System.out.printf("Tab function: \n  x     f(x)\n");
        for (double i = start; i <= end; i += 0.1) 
        {
            func = Math.sin(i) - (1 / 3) * Math.cos(Math.pow(i, (1 / 5)));
            System.out.printf("%.3f  %.3f\n", i, func);
            times += 1;
        }
        return times;
    }

    void output(int times) 
    {
        if (times == 0) 
        {
            System.out.println("There are no solutions in this interval.");
        } 
        else 
        {
            System.out.println("There are " + times + " solutions in this range.");
        }
    }
}
