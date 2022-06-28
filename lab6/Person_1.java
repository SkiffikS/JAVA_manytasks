//package lab6;

public class Person_1
{
    String FullnName;
    int age;

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

    public Person_1(){}

    public Person_1(String FullnName, int age)
    {
        this.FullnName = FullnName;
        this.age = age;
    }

    public static void main(String[] args) 
    {
        Person_1 student = new Person_1();
        student.FullnName = "Yaroslav Kuchinskiy";
        student.age = 18;
        talk(student.FullnName);
        move(student.FullnName);
    }
}