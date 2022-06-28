// create class
public class task_3 
{
    // create function
    public static void main(String[] args)
    {
        // ask users info
        int User_0_id = 43;
        int User_0_age = 21;
        String User_0_name = "Volodymur";
        String User_0_surname = "Bovanko";
        double User_0_weight = 85.7f;
        double User_0_height = 185.7f;

        int User_1_id = 68;
        int User_1_age = 18;
        String User_1_name = "Yriu";
        String User_1_surname = "Gidt";
        double User_1_weight = 78.5f;
        double User_1_height = 175.7f;

        int User_2_id = 75;
        int User_2_age = 19;
        String User_2_name = "Viktor";
        String User_2_surname = "Gulin";
        double User_2_weight = 90.1f;
        double User_2_height = 197.2f;

        int User_3_id = 12;
        int User_3_age = 20;
        String User_3_name = "Vitaliy";
        String User_3_surname = "Nikoliv";
        double User_3_weight = 80.2f;
        double User_3_height = 178.1f;

        int User_4_id = 61;
        int User_4_age = 18;
        String User_4_name = "Ylia";
        String User_4_surname = "Oliynik";
        double User_4_weight = 84.2f;
        double User_4_height = 182.1f;

        int User_5_id = 85;
        int User_5_age = 23;
        String User_5_name = "Roman";
        String User_5_surname = "Sivak";
        double User_5_weight = 102.7f;
        double User_5_height = 188.8f;

        int User_6_id = 32;
        int User_6_age = 17;
        String User_6_name = "Taras";
        String User_6_surname = "Stecina";
        double User_6_weight = 65.7f;
        double User_6_height = 168.5f;

        int User_7_id = 86;
        int User_7_age = 22;
        String User_7_name = "Mikola";
        String User_7_surname = "Tischenko";
        double User_7_weight = 80.1f;
        double User_7_height = 177.7f;

        int User_8_id = 11;
        int User_8_age = 18;
        String User_8_name = "Denis";
        String User_8_surname = "Chylyp";
        double User_8_weight = 92.7f;
        double User_8_height = 180.3f;

        int User_9_id = 43;
        int User_9_age = 19;
        String User_9_name = "Pavlo";
        String User_9_surname = "Kindrat";
        double User_9_weight = 66.3f;
        double User_9_height = 174.2f;

        // sum users age
        int sum_age = User_0_age + User_1_age + User_2_age + 
        User_3_age + User_4_age + User_5_age + User_6_age + 
        User_7_age + User_8_age + User_9_age;

        // sum users weight
        double sum_weight = User_0_weight + User_1_weight +
        User_2_weight + User_3_weight + User_4_weight + 
        User_5_weight + User_6_weight + User_7_weight + 
        User_8_weight + User_9_weight;

        // sum users height
        double sum_height = User_0_height + User_1_height +
        User_2_height + User_3_height + User_4_height +
        User_5_height + User_6_height + User_7_height + 
        User_8_height + User_9_height;

        // print all
        System.out.printf("sum age users: %d\n", sum_age);
        System.out.printf("sum weight users: %.2f\n", sum_weight);
        System.out.printf("sum height users: %.2f\n", sum_height);
    }
}
