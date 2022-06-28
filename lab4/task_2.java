import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class task_2 
{
    public static void main(String[] args) 
    {
        int[] list = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 0;
        System.out.println("list elements (while)");
        while(i < list.length)
        {
            System.out.println(list[i]);
            i++;
        }
        System.out.println("list elements (for)");
        for(int j = 0; j < list.length; j++)
        {
            System.out.println(list[j]);
        }
        System.out.println("list even index elements");
        i = 0;
        while(i < list.length)
        {
            System.out.println(list[i]);
            i = i + 2;
        }
        System.out.println("list odd index elements");
        for(int j = 1; j < list.length; j = j + 2)
        {
            System.out.println(list[j]);
        }
        System.out.println("reversed list");
        for(int e = list.length - 1; e > -1; e--)
        {
            System.out.println(list[e]);
        }
    }
}
