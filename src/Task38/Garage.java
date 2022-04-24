package Task38;

public class Garage<T extends Vehicle> {
    private T car;
    private T motorcycle;


    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public T getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(T motorcycle) {
        this.motorcycle = motorcycle;
    }
}

