import java.util.Scanner;

public class dima {
     public static void f(int x)
     {
         double x1=Math.pow(Math.E, 2*x);
         double x2=Math.pow(9 * x, 2);
         double x3=x*x-2*x+x-2;
         int n=0;
         if (x1<-2)
        {
             n++;
        }
        else
        { 
             System.out.println("condiction 'x<-2' in the equation 1 is not met, x="  +x1);
        } 
         if (-3<=x2 & x2<= 30)
        {
             n++;
        }
         else
        {
         System.out.println("condiction 'x>3' int the equation 3 is not met , x="+x3);
        }
        if (x3>2)
        {
             n++;
        }
         else
        {
             System.out.println("condiction 'x>3' int the equation 3 is not met , x="+x3);
        }
        if (n==2)
        {
             System.out.println("the equation is solved");
        
        }
    }
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         System.out.print("input x:");
         int x = scanner.nextInt();
         f(x);
    }
    
}
