import java.util.Scanner;

public class task_1 
{
    public static int S_k(int a)
    {
        int S = a * a;
        return S;
    }
    public static int S_p(int a, int b)
    {
        int S = a * b;
        return S;
    }
    public static double S_par(int a, int b)
    {
        double S = a * b * Math.sin(a);
        return S;
    }
    public static double S_r(int a)
    {
        double S = a * a * Math.sin(a);
        return S;
    }
    public static double S_pr_t(int a, int b)
    {
        double S = 0.5 * a * b;
        return S;
    }
    public static double S_trap(int a, int b, int h)
    {
        double S = ((a + b) / 2) * h;
        return S;
    }
    public static double S_kol(int r)
    {
        double S = 2 * Math.PI * r;
        return S;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length: ");
        int a = scanner.nextInt();
        System.out.print("enter width: ");
        int b = scanner.nextInt();
        System.out.print("enter height: ");
        int h = scanner.nextInt();
        System.out.print("enter radius: ");
        int r = scanner.nextInt();

        System.out.println("square area = " + S_k(a));
        System.out.println("Enter the sides rectangle: ");
        System.out.println("area rectangle = " + S_p(a, b));
        System.out.println("area parallelogram = " + S_par(a, b));
        System.out.println("area rhombus = " + S_r(a));
        System.out.println("area right triangle = " + S_pr_t(a, b));
        System.out.println("area right trapezoid = " + S_trap(a, b, h));
        System.out.println("area rhombus = " + S_kol(r));
    }
}
