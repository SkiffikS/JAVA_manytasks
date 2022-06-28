import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class task_1 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input path file: ");
        String file = in.nextLine();

        System.out.print("Input min number: ");
        int min = in.nextInt();

        System.out.print("Input max number: ");
        int max = in.nextInt();

        System.out.print("Input lenght numbers: ");
        int len = in.nextInt();

        int[] array = new int[len];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt(max + 1 - min) + min;

        try (final FileWriter writer = new FileWriter(file, false))
        {
            for (int i = 0; i < array.length; ++i)
            {
                final String s = Integer.toString(array[i]);
                writer.write(s);
                writer.write(System.lineSeparator());
                System.out.println(s);
            }
        }
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
