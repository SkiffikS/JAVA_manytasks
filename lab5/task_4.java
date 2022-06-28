public class task_4 
{
    public static int max_arr(int[] list)
    {
        int n = - 999;
        for(int i = 0; i < list.length; i++)
        {
            if(n < list[i])
            {
                n = list[i];
            }
        }
        return n;
    }
    public static void main(String[] args) 
    {
        int[] list = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        System.out.println("max number - " + max_arr(list));
    }
}
