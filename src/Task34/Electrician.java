package Task34;

public class Electrician extends Worker implements Salary {

    double proceeds;

    public Electrician(String name, int age, String post, double proceeds) {
        super(name, age, post);
        this.proceeds = proceeds;
    }

    @Override
    public void calculateSalary() {
        double sum = (proceeds * Salary.percentageElectrician) / 100;
        System.out.println("Зарплата электрика= " + sum + " р.");

    }
}
