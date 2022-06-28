
import java.util.*;
import java.lang.Math;

public class t5_2 
{
    public static void main(String[] args) 
    {
        F func = new F();
        func.X_Min().X_Max().Step().reverse().tabulation();
        func.output();
    }
}

class F {
    
    double min;
    double max;
    double step;
    double func;
    Scanner in = new Scanner(System.in);
    List<Double> y_value = new ArrayList<>();
    List<Double> x_value = new ArrayList<>();

    F X_Min() 
    {
        System.out.print("Enter the lower limit: ");
        min = in.nextDouble();
        return this;
    }

    F X_Max() 
    {
        System.out.print("Enter the upper limit: ");
        max = in.nextDouble();
        return this;
    }

    F Step() 
    {
        System.out.print("Enter a tab step: ");
        step = in.nextDouble();
        return this;
    }

    F reverse() 
    {
        double t;
        if (min > max) 
        {
            t = min;
            min = max;
            max = t;
        }
        return this;
    }

    void tabulation() 
    {
        for (double i = min; i <= max; i += step) 
        {
            fillArray(i);
        }
    }

    void fillArray(double x) 
    {
        try 
        {
            func = Math.sin(x) - (1 / Math.pow(x, 2)) * Math.cos(Math.sqrt(x));
            if (Double.isInfinite(func) == true) 
            {
                throw new Exception("It is impossible to divide by zero.");
            }
            if (Double.isNaN(func) == true) 
            {
                throw new Exception("The root of a negative number does not exist.");
            } 
            else 
            {
                y_value.add(func);
                x_value.add(x);
            }
        } 
        catch (Exception ex) 
        {
            System.out.print(ex.getMessage() + "\n");
            System.out.printf("in x = %.2f function does not exist.\n\n", x);
        }
    }

    void output() 
    {
        try 
        {
            System.out.println("------------------");
            System.out.print("|   x   |   y   |\n");
            System.out.println("------------------");
            for (int i = 0;; i++) 
            {
                System.out.printf("| %.2f | %.2f |\n", x_value.get(i), y_value.get(i));
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("------------------");
        }
    }
}
