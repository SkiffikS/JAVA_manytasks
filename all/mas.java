import java.util.Scanner;
import java.util.Random;

public class mas
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("input n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            int randomNumber = rand.nextInt(-50, 50);
            array[i] = randomNumber;
            System.out.println("array[" + i + "] = " + randomNumber);
            sum += randomNumber;
        }

        System.out.println("\nSum array numbers = " + sum);
        int middle_array_number = (int) sum / n;
        System.out.println("middle array rounding number = " + middle_array_number);

        int distance = Math.abs(array[0] - middle_array_number);
        int idx = 0;
        for(int c = 1; c < array.length; c++) 
        {
            int cdistance = Math.abs(array[c] - middle_array_number);
            if (cdistance < distance) 
            {
                idx = c;
                distance = cdistance;
            }
        }
        int theNumber = array[idx];
        System.out.println("the closest value in the array = " + theNumber);
    }
}