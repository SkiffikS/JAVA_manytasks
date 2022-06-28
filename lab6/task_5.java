//

public class task_5
{
    String day;
    String moon;
    String year;

    public static int Europe(String day, String moon, String year)
    {
        System.out.println("data in Europe standart: ");
        System.out.println(day + ":" + moon + ":" + year);
        return 0;
    }

    public static int American(String day, String moon, String year)
    {
        System.out.println("data in American standart: ");
        System.out.println(moon + ":" + day + ":" + year);
        return 0;
    }

    public task_5(String day, String moon, String year) 
    {
        this.day = day;
        this.moon = moon;
        this.year = year;
    }

    public static void main(String[] args) 
    {
        task_5 time = new task_5("30", "11", "2022");
        time.Europe(time.day, time.moon, time.year);
        time.American(time.day, time.moon, time.year);
    }
}
