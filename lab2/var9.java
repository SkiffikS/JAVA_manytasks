import java.util.Scanner;

public class var9 
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("Indicate the time of year by which month it belongs");
            System.out.print("input intention of the month: ");
            int x = scanner.nextInt();
            switch (x) 
            {
                case 12:
                    System.out.println("winter");
                    break;
                case 1:
                    System.out.println("winter");
                    break;
                case 2:
                    System.out.println("winter");
                    break;
                case 3:
                    System.out.println("spring");
                    break;
                case 4:
                    System.out.println("spring");
                    break;
                case 5:
                    System.out.println("spring");
                    break;
                case 6:
                    System.out.println("summer");
                    break;
                case 7:
                    System.out.println("summer");
                    break;
                case 8:
                    System.out.println("summer");
                    break;
                case 9:
                    System.out.println("autumn");
                    break;
                case 10:
                    System.out.println("autumn");
                    break;
                case 11:
                    System.out.println("autumn");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
