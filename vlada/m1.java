package vlada;

public class m1
{
    public static void main(String[] args) 
    {
        int[] list = {2, 17, 13, 6, 22, 31, 45, 66, 100, 13, -18};
        for(int i = 0; i < list.length; i++)
        {
            int element_1 = list[i];
            int coincidence = 0;
            for(int j = 0; j < list.length; j++)
            {
                int element_2 = list[j];
                if(element_1 == element_2)
                {
                    coincidence += 1;
                    //list.remove(j);
                }
            }
            System.out.printf("number '%d' - %d\n", element_1, coincidence);
        }
    }
}