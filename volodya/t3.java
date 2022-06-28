import java.util.Scanner;

class task_2
{
    static int main1() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("min: ");
        double min = scanner.nextDouble();
        System.out.print("max = ");
        double max = scanner.nextDouble();
        System.out.println("FOR: ");
        for(double x = 10; x <= 30; x++)
        {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if(y/10 >= min && y/10 <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y / 10);
            }
        }
        
        System.out.println("While: ");
        double x = 10;
        while(x <= 30)
        {
            double y = x + Math.pow(Math.E, Math.sin(x * x) - 2.2);
            if(y/10 >= min && y/10 <= max)
            {
                System.out.println("x = " + x / 10 + "; y = " + y / 10);
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
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 60; j++)
            {
                for(int e = 0; e < 60; e++)
                {
                    System.out.println(i + "h " + j + "min " + e + "sec ");
                }
            }
        }
        return 0;
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер завдання яке хочете викликати");
        System.out.print("(1 чи 2): ");
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
            System.out.println("Неіснує такого завдання");
        }
    }
}

