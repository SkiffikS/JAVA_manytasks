public class var_10 
{
    public static double f(double x)
    {
        double f = Math.sqrt((x * x * x + x + 1.5) / (x - 1));
        return f;
    }
    public static void main(String[] args) 
    {
        System.out.println("for: ");
        for(double x = 0; x < 4.1; x = x + 0.2)
        {
            System.out.printf("f(%.1f) = %.2f\n", x, f(x));
        }
        double y = 0;
        System.out.println("While: ");
        while(y < 4.1)
        {
            System.out.printf("f(%.1f) = %.2f\n", y, f(y));
            y += 0.2;
        }
    }
}
