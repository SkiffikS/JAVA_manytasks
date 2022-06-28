class IT_firm {
    String name;
    int number_employees;
    int average_salary;
    int old_years;
    String[] form_work;

    IT_firm(){}

    IT_firm(String name, int number_employees, int average_salary, int old_years, String[] form_work) {
        this.name = name;
        this.number_employees = number_employees;
        this.average_salary = average_salary;
        this.old_years = old_years;
        this.form_work = form_work;
    }

    public void get_form_work(String[] form_work) {
        for (int i = 0; i < form_work.length; i++) {
            System.out.println("possible form of work - " + form_work[i]);
        }
    }

    public void get_firm_info(String name, int number_employees, int average_salary, int old_years, String[] form_work) {
        System.out.println("Firm name - " + name);
        System.out.println("Number of employees firm - " + number_employees);
        System.out.println("average salary in the firm - " + average_salary + "$");
        System.out.println("The firm already exists - " + old_years + ", year of foundation of the company - " + (2022 - old_years));
        System.out.println("All possible forms of work: ");
    }

    public void costs_firm(int number_employees, int average_salary) {
        System.out.println(
                "The company's expenses for a salary for 1 month = " + number_employees * average_salary + "$");
    }
}

class Main {
    public static void main(String[] args) {
        String[] s = { "Remote", "Full attendance", "Half remote" };
        IT_firm Goldweb_Solutions = new IT_firm("Goldweb Solutions", 2000, 1500, 21, s);
        Goldweb_Solutions.get_firm_info(Goldweb_Solutions.name, Goldweb_Solutions.number_employees,
                Goldweb_Solutions.average_salary, Goldweb_Solutions.old_years, Goldweb_Solutions.form_work);
        Goldweb_Solutions.get_form_work(Goldweb_Solutions.form_work);
        Goldweb_Solutions.costs_firm(Goldweb_Solutions.number_employees, Goldweb_Solutions.average_salary);
    }
}