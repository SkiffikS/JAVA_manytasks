import java.util.Scanner;

public class task_1 
{
    public static void main(String[] args) 
    {
        System.out.println("Solving the equation of the form:");
        System.out.println("ax^2 + bx + c = 0");

        Scanner scanner = new Scanner(System.in);
        System.out.print("input a: ");
        int a = scanner.nextInt();
        System.out.print("input b: ");
        int b = scanner.nextInt();
        System.out.print("input c: ");
        int c = scanner.nextInt();

        double D = b * b - 4 * a * c;
        if (D > 0) 
        {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("equation roots:\nx1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) 
        {
            double x;
            x = -b / (2 * a);
            System.out.println("only root of the equation:\nx = " + x);
        }
        else 
        {
            System.out.println("equation has no roots");
        }
    }
}
