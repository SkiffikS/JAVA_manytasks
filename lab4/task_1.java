import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class task_1
{
    public static void main(String[] args) 
    {
        List even_numbers = new ArrayList();
        List odd_numbers = new ArrayList();

        for(int i = 1; i < 101; i ++)
        {
            if((i & 1) == 0)
            {
                even_numbers.add(i);
            }
            else
            {
                odd_numbers.add(i);
            }
        }
        System.out.println(even_numbers);
        System.out.println(odd_numbers);
    }
}