public class task_3 
{
    public static void print_arr(int[] list) 
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args) 
    {
        int[] list = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        print_arr(list);
    }
}
