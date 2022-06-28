import java.util.Scanner;

class task_2
{
    static int main1() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("minimum =  ");
        double min = scanner.nextDouble();
        System.out.print("maximum = ");
        double max = scanner.nextDouble();
        System.out.println("FOR: ");
        for (double x = 1; x <= 3; x++) {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if (y >= min && y <= max) {
                System.out.println("x = " + x + "; y = " + y);
            }
        }

        System.out.println("While: ");
        double x = 1;
        while (x <= 3) {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if (y >= min && y <= max) {
                System.out.println("x = " + x + "; y = " + y);
            }
            x++;
        }
        return 0;
    }
}

class task_1
{
    static int main1() 
    {
        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 60) {
                int e = 0;
                while (e < 60) {
                    System.out.println(i + "h " + j + "min " + e + "sec ");
                    e++;
                }
                j++;
            }
            i++;
        }
        return 0;
    }
}

public class t3
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input task");
        System.out.print("(1 or 2): ");
        int number = scanner.nextInt();
        task_1 task1 = new task_1();
        task_2 task2 = new task_2();
        if(number == 1)
        {
            task_1.main1();
        }
        else if(number == 2)
        {
            task_2.main1();
        }
        else
        {
            System.out.println("Error");
        }
    }
}

