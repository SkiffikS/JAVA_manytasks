import java.util.Scanner;

class funk
{
    int x;
    double step;

    public funk(int x, double step) 
    {
        this.x = x;
        this.step = step;
    }

    public void f(double x, double step)
    {
        int n = 0;
        double[] list = new double[(int) ((3 - 1) / step)];
        for(double i = 1f; i < 3; i = i + step)
        {
            try 
            {
                double result = x + Math.log10(Math.sin(x));
                x += step;
                // System.out.println(result);
                list[n] = result;
                n++;
            } 
            catch (Exception e) 
            {
                System.out.println("error: " + e);
            }
        }
        for(int i = 0; i < list.length; i++)
            System.out.println("array[" + i + "] = " + list[i]);
    }
}


public class task2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("input x: ");
        int x = input.nextInt();
        System.out.print("input step: ");
        double step = input.nextDouble();
        funk f = new funk(x, step);
        f.f(x, step);
    }
}
