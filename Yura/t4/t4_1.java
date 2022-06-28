
import java.util.*;

public class t4_1 
{
    public static void main(String[] args) 
    {
        Array arr = new Array();
        arr.repetitionCheck(arr.inputLengthAndMassive());
        arr.output();
    }
}


class Array {

    List<Integer> list = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int length;
    int[] mas = null;

    int[] inputLengthAndMassive() 
    {
        System.out.print("Input lenght array: ");
        this.length = in.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) 
        {
            System.out.printf("array[" + i  + "] = ");
            array[i] = in.nextInt();
        }
        return array;
    }

    void repetitionCheck(int[] array) 
    {
        this.length = array.length;

        Arrays.sort(array);

        for (int i = 0; i < this.length - 1; i++) 
        {
            if (array[i] == array[i + 1]) 
            {
                list.add(array[i]);
            }

        }
        for (int i = 0; i < list.size(); i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(i) == list.get(j)) 
                {
                    list.remove(j);
                }
            }
        }
    }

    void output() 
    {
        System.out.print("Repeating numbers in this array: \n");
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + "\n");
        }
    }
}
