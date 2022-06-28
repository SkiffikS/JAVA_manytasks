public class laba2 {
    public static void main(String[] args) 
    {

        String start_name = "niyd VorotVla";
        System.out.println("My string: " + start_name);
        String substr1 = start_name.substring(start_name.length() - 3);
        String substr2 = start_name.substring(0,3);
        String end_name = start_name.substring(3, start_name.length()-3);
        System.out.println("Result: " + substr1 + end_name + substr2);
    }
}

    

