// import scan module for input number
import java.util.Scanner;

// create class
public class task_5 
{
    // create funk
    public static void main(String[] args) 
    {
        // input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        // convertible type input number to int
        int num = sc.nextInt();
        // create an empty variable to use
        int reversed = 0;

        for(;num != 0; num /= 10){
            // get the last digit through the rest
            int digit = num % 10;
            // add number to beginning variable reversed
            reversed = reversed * 10 + digit;
        }
        // print reversed number
        System.out.println("Reversed Number: " + reversed);
    }
}
