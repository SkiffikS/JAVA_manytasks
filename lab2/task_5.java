package lab2;
import java.util.Scanner;

public class task_5 
{
    public static void side_task_1(int x) 
    {
        if(x > 5)
        {
            System.out.println("weekend");
        }
        else
        {
            System.out.println("not weekend");
        }
    }
    public static void side_task_2(int x) 
    {
        if(x > 0 & x < 4)
        {
            System.out.println("winter");
        }
        if(x > 3 & x < 7)
        {
            System.out.println("spring");
        }
        if(x > 6 & x < 10)
        {
            System.out.println("summer");
        }
        if(x > 9 & x < 12)
        {
            System.out.println("autumn");
        }
        if(x < 0 || x > 12)
        {
            System.out.println("Error");
        }
    }
    public static void side_task_3(int x)
    {
        if((x & 1) == 0)
        {
            if(x == 2)
            {
                System.out.println("29");
            }
            else
            {
                System.out.println("30");
            }
        }
        else
        {
            System.out.println("31");
        }
    }
    public static void side_task_4(int x)
    {
        if(x > 0 & x < 5)
        {
            if(x == 1)
            {
                System.out.println("Welcome");
            }
            if(x == 2)
            {
                System.out.println("Enjoy your job");
            }
            if(x == 3)
            {
                System.out.println("Goodbye");
            }
        }
        else
        {
            System.out.println("Error");
        }
    }
    public static void side_task_5(int x)
    {
        if(x > 0 & x < 5)
        {
            if(x == 1)
            {
                System.out.println("Object-oriented programming");
            }
            if(x == 2)
            {
                System.out.println("Electrodynamics and propagation of radio waves");
            }
            if(x == 3)
            {
                System.out.println("Signal transmission in information systems");
            }
            if(x == 4)
            {
                System.out.println("Physical Education");
            }
        }
        else
        {
            System.out.println("Error");
        }
    }
    public static void side_task_6(int x)
    {
        if(x > 0 & x < 60)
        {
            if(x >= 0 & x <= 15)
            {
                System.out.println("1/4");
            }
            if(x >= 16 & x <= 30)
            {
                System.out.println("2/4");
            }
            if(x >= 31 & x <= 45)
            {
                System.out.println("3/4");
            }
            if(x >= 49 & x <= 59)
            {
                System.out.println("4/4");
            }
        }
        else
        {
            System.out.println("Error");
        }
    }
    public static void side_task_7(int x, int x1, int x2)
    {
        if(x > 0 & x < 4)
        {
            if(x == 1)
            {
                System.out.println("product" + x1 + "*" + x2 + " = " + (x1 * x2));
            }
            if(x == 2)
            {
                System.out.println("sum" + x1 + "+" + x2 + " = " + (x1 + x2));
            }
            if(x == 3)
            {
                System.out.println("subtraction" + x1 + "-" + x2 + " = " + (x1 - x2));
            }
        }
        else
        {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("task_1");
        System.out.println("According to the day number of the week, print the working day or weekend, including Saturday and Sunday");
        System.out.print("input weekday (1 - monday, 7 - Sunday): ");
        int x1 = scanner.nextInt();
        side_task_1(x1);
        System.out.println("task_2");
        System.out.println("Indicate the time of year by which month it belongs");
        System.out.print("input intention of the month: ");
        int x2 = scanner.nextInt();
        side_task_2(x2);
        System.out.println("task_3");
        System.out.println("By the number of the month to print the number of days in it");
        System.out.print("input intention of the month: ");
        int x3 = scanner.nextInt();
        side_task_3(x3);
        System.out.println("task_4");
        System.out.println("Create a text menu in which you select the first item a greeting is displayed, when you select the second item - an invitation to work on the computer, with the choice of the third - is offered");
        System.out.print("input action(1 - 3): ");
        int x4 = scanner.nextInt();
        side_task_4(x4);
        System.out.println("task_5");
        System.out.println("Write a program that the number of the pair (a natural number from 1 to 4) on this day gives the name of the subject on this pair");
        System.out.print("input number(1 - 4): ");
        int x5 = scanner.nextInt();
        side_task_5(x5);
        System.out.println("task_6");
        System.out.println("The variable min has a number from 0 to 59. Display in the console in which quarter hours this number falls (in the first, second, third or fourth)");
        System.out.print("input minute: ");
        int x6 = scanner.nextInt();
        side_task_6(x6);
        System.out.println("task_7");
        System.out.println("By the number of the month to print the number of days in it");
        System.out.print("input action(1 - product, 2 - sum, 3 - subtraction): ");
        int x7 = scanner.nextInt();
        System.out.print("input number 1: ");
        int n1 = scanner.nextInt();
        System.out.print("input number 2: ");
        int n2 = scanner.nextInt();
        side_task_7(x7, n1, n2);
    }
}
