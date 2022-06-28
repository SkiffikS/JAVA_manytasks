import java.util.Scanner;

public class task_2 
{
    public static int numbers(int a, int b, int c)
    {
        int n = 999;
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for(int i = 0; i < 3; i++)
        {
            if(n > arr[i])
            {
                n = arr[i];
            }
        }
        return n;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        int a = scanner.nextInt();
        System.out.print("number 2: ");
        int b = scanner.nextInt();
        System.out.print("number 3: ");
        int c = scanner.nextInt();
        System.out.println("min number - " + numbers(a, b, c));
    }
}
