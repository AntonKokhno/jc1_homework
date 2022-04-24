package Task34;

public class DirectorFactory extends Worker implements Salary {
    int hoursWorked;

    public DirectorFactory(String name, int age, String post, int hoursWorked) {
        super(name, age, post);
        this.hoursWorked = hoursWorked;
        System.out.println();
    }

    @Override
    public void calculateSalary() {
        double sum = hoursWorked * Salary.hourlyCostDirector;
        System.out.println("Зарплата директора= " + sum + " р.");

    }
}

