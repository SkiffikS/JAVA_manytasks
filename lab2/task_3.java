package lab2;
import java.util.Scanner;

public class task_3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int n = scanner.nextInt();
        if ((n & 1) == 0) 
        {
            System.out.println("even number");
        } 
        else 
        {
            System.out.println("odd number");
        }
        if(9 < n & n < 100)
        {
            System.out.println("two-digit number");
        }
        else 
        {
            System.out.println("not an ambiguous number");
        }
    }
}
