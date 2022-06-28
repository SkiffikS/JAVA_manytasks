import java.util.ArrayList;
import java.util.List;


class HashMap 
{
    public int put(ArrayList<Phone> Phonebook, Phone phone)
    {
        Phonebook.add(phone);
        return 0;
    }

    public int get(ArrayList<Phone> Phonebook, String key)
    {
        String result = "User not found";
        for (int i = 0; i < Phonebook.size(); i++) 
        {
            if(Phonebook.get(i).key == key) 
            {
                result = "User fount, he value - " + Phonebook.get(i).value;
            } 
        }

        System.out.println(result);
        
        return 0;
    }

    public int remove(ArrayList<Phone> Phonebook, String key)
    {
        for (int i = 0; i < Phonebook.size(); i++) 
        {
            if (Phonebook.get(i).key == key) 
            {
                Phonebook.remove(i);
                System.out.println("User remove");
            }
        }

        return 0;
    }
    
    public int containsKey(ArrayList<Phone> Phonebook, String key)
    {
        String result = "No, the required key is registered in the card";
        for (int i = 0; i < Phonebook.size(); i++) 
        {
            if (Phonebook.get(i).key == key) 
            {
                result = "Yep, the required key is registered in the card";
            } 
        }

        System.out.println(result);
        
        return 0;
    }
    
    public int containsValue(ArrayList<Phone> Phonebook, String value)
    {
        String result = "Number not found";
        for (int i = 0; i < Phonebook.size(); i++) 
        {
            if (Phonebook.get(i).value == value) 
            {
                result = "this number is written as: " + Phonebook.get(i).key;
            }
        }
        
        System.out.println(result);

        return 0;
    }
    
    public int sizeBook(ArrayList<Phone> Phonebook)
    {
        System.out.println("number of recorded numbers - " + Phonebook.size());
        return 0;
    }
}


class Phone
{
    String key;
    String value;

    void Phone(String key, String value)
    {
        this.key = key;
        this.value = value;
    }
}


public class task_2 
{
    public static void main(String[] args) 
    {
        Phone phone1 = new Phone();
        phone1.key = "Vlad";
        phone1.value = "+ 38 (063) 399 3123";

        Phone phone2 = new Phone();
        phone2.key = "Pavlo";
        phone2.value = "+ 38 (069) 413 3209";

        Phone phone3 = new Phone();
        phone3.key = "Bogdan";
        phone3.value = "+ 38 (099) 841 1116";

        Phone phone4 = new Phone();
        phone4.key = "Maxim";
        phone4.value = "+ 38 (028) 432 6144";

        Phone phone5 = new Phone();
        phone5.key = "Olexiy";
        phone5.value = "+ 38 (072) 163 2745";

        Phone phone6 = new Phone();
        phone6.key = "Vlad";
        phone6.value = "+ 38 (063) 388 3629";

        Phone phone7 = new Phone();
        phone7.key = "Volodya";
        phone7.value = "+ 38 (053) 278 6139";

        Phone phone8 = new Phone();
        phone8.key = "Yura";
        phone8.value = "+ 38 (073) 613 1743";

        Phone phone9 = new Phone();
        phone9.key = "Tanya";
        phone9.value = "+ 38 (089) 163 1621";

        Phone phone10 = new Phone();
        phone10.key = "Olena";
        phone10.value = "+ 38 (082) 623 1641";

        ArrayList<Phone> Phonebook = new ArrayList<>();
        Phonebook.add(phone1);
        Phonebook.add(phone2);
        Phonebook.add(phone3);
        Phonebook.add(phone4);
        Phonebook.add(phone5);
        Phonebook.add(phone6);
        Phonebook.add(phone7);
        Phonebook.add(phone8);
        Phonebook.add(phone9);

        HashMap Map = new HashMap();
        Map.put(Phonebook, phone10);
        Map.get(Phonebook, "Tanya");
        Map.remove(Phonebook, "Tanya");
        Map.containsKey(Phonebook, "Vlad");
        Map.containsValue(Phonebook, "+ 38 (082) 623 1641");
        Map.sizeBook(Phonebook);
    }
}