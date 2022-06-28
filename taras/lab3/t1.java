public class t1
{
    public static void main(String[] args) 
    {
        int i = 0;
        while(i < 3)
        {
            int j = 0;
            while (j < 60) {
                int e = 0;
                while (e < 60) {
                    System.out.println(i + "h " + j + "min " + e + "sec ");
                    e++;
                }
                j++;
            }
            i++;
        }
    }
}