class Student_group {
    private int id;
    private String group_name;
    private int number_students;
    private int number_boys;
    private int number_girls;

    Student_group(int id, String group_name, int number_students, int number_boys, int number_girls) {
        this.id = id;
        this.group_name = group_name;
        this.number_students = number_students;
        this.number_boys = number_boys;
        this.number_girls = number_girls;
    }

    void check_info(int number_students, int number_boys, int number_girls) {
        if (number_boys + number_girls != number_students) {
            System.out.println("wrong number of students");
        } else {
            System.out.println("correctly data");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setNumber_students(int number_students) {
        this.number_students = number_students;
    }

    public int getNumber_students() {
        return number_students;
    }

    public void setNumber_boys(int number_boys) {
        this.number_boys = number_boys;
    }

    public int getNumber_boys() {
        return number_boys;
    }

    public void setNumber_girls(int number_girls) {
        this.number_girls = number_girls;
    }

    public int getNumber_girls() {
        return number_girls;
    }

    void get_info(int id, String group_name, int number_students, int number_boys, int number_girls) {
        System.out.println("Group: " + group_name + "\nID - " + id + "\nNumber students: "
                + number_students + "\nBoys: " + number_boys + "\nGirls: " + number_girls);
    }
}


class task1 {
    public static void main(String[] args) {
        Student_group tr_24 = new Student_group(24, "TR-24", 20, 19, 1);
        int id = tr_24.getID();
        String name = tr_24.getGroup_name();
        int students = tr_24.getNumber_students();
        int boys = tr_24.getNumber_boys();
        int girls = tr_24.getNumber_girls();
        tr_24.check_info(students, boys, girls);
        tr_24.get_info(id, name, students, boys, girls);
    }
}
