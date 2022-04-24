package Task34;

public class MainEngineer extends Worker implements Salary {
    int hoursWorked;
    int proceeds;


    public MainEngineer(String name, int age, String post, int hoursWorked, int proceeds) {
        super(name, age, post);
        this.hoursWorked = hoursWorked;
        this.proceeds = proceeds;
    }

    @Override
    public void calculateSalary() {
        double sum = Salary.hourlyCostMainEngineer * hoursWorked + ((proceeds * Salary.percentageMainEngineer) / 100);
        System.out.println("Зарплата главного инженера= " + sum + " р.");
    }
}
