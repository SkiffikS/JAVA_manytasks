import java.util.Scanner;

public class task2_2 
{
    public static void main(String[] args) 
    {
        System.out.println("Select the unit of distance");
        System.out.println("1 - centimeter\n2 - millimeter\n3 - decimetre\n4 - meter");
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number(index unit): ");
        int n = scanner.nextInt();
        System.out.print("S = ");
        int S = scanner.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("" +S + " centimeter - " + S * Math.pow(10, -5) + " kilometers");
                break;
            case 2:
                System.out.println(S + " millimeter - " + S * Math.pow(10, -6) + " kilometers");
                break;
            case 3:
                System.out.println(S + " decimetre - " + S * Math.pow(10, -4) + " kilometers");
                break;
            case 4:
                System.out.println(S + " mete - " + S * Math.pow(10, -3) + " kilometers");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
