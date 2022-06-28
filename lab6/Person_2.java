package lab6;

public class Person_2
{

    private int age;
    private String FullnName;

    public Person_2(String FullnName, int age)
    {
        this.FullnName = FullnName;
        this.age = age;
    }

    public static int move(String name)
    {
        System.out.println("person " + name + " speak");
        return 0;
    }
    public static int talk(String name)
    {
        System.out.println("person " + name + " speak");
        return 0;
    }

    public static void main(String[] args) 
    {
        Person_2 student = new Person_2("Yaroslav Kuchinskiy", 18);
    }
}