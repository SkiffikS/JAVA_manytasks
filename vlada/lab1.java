import java.util.Scanner;
public class lab1

{

    public static void main(String [] args){
        try (Scanner num = new Scanner(System.in)) {
            float x = 1.2f, y = -0.8f;
            double s,z; 
            System.out.println("x = " + x);   
            System.out.println("z = " + y );

            s = 1 + x + ((Math.pow(x,2)/2)+(Math.pow(x,3)/3)+(Math.pow(x,4)/4));
            System.out.printf("Result l = %.2f\n", s);
            z = (Math.sin(Math.pow(x,3)) + 2*Math.cos(y));
            System.out.printf("Result l = %.2f\n", z);
        }
        
    }
    
}
