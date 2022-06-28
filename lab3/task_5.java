public class task_5 
{
    public static double f(double x)
    {
        double f = Math.sin(x * x) + Math.cos(x * x) - 10 * x;
        return f;
    }
    public static void main(String[] args) 
    {
        System.out.println("for: ");
        for(double x = 0; x < 2.1; x = x + 0.1)
        {
            System.out.printf("f(%.1f) = %.2f\n", x, f(x));
        }
        double y = 0;
        System.out.println("While: ");
        while(y < 2.1)
        {
            System.out.printf("f(%.1f) = %.2f\n", y, f(y));
            y += 0.1;
        }
    }
}
