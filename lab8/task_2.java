import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class task_2 {
    public static void main(String[] args) 
    {
        BufferedInputStream bis = null;
        byte[] buffer = new byte[8192];
        int bytesRead = 0;
        try 
        {
            bis = new BufferedInputStream(new FileInputStream("random.txt"));
            while ((bytesRead = bis.read(buffer)) != -1) 
            {
                System.out.write(buffer, 0, bytesRead);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                bis.close();
            } 
            catch (Exception e) 
            {
                /* meh */
            }
        }
    }
}
