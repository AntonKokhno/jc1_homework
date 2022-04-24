package Task34;



public class Main {
    public static void main(String[] args) {


        DirectorFactory directorFactory = new DirectorFactory("Андрей", 45, "Директор", 178);
        directorFactory.calculateSalary();
        MainEngineer mainEngineer = new MainEngineer("Антон", 30, "Главный инженер", 178,
                100000);
        mainEngineer.calculateSalary();
        Electrician electrician = new Electrician("Иван", 44, "Электрик", 40000);
        electrician.calculateSalary();
    }

}
