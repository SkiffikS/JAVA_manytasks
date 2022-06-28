import java.util.Scanner;

class funk {
    int x;
    double step;

    public funk(int x, double step) {
        this.x = x;
        this.step = step;
    }

    public void f(double x, double step) {
        int n = 0;
        int array_size = (int) ((3 - 1) / step);
        double[] list = new double[array_size];
        double i = 1f;
        while (i < 3) {
            try {
                double result = x + Math.log10(Math.sin(x));
                x += step;
                // System.out.println(result);
                list[n] = result;
                n++;
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
            i = i + step;
        }

        for (int j = 0; j < list.length; j++)
            System.out.println("array[" + j + "] = " + list[j]);
    }
}


public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("step = ");
        double step = input.nextDouble();
        funk f = new funk(x, step);
        f.f(x, step);
    }
}
