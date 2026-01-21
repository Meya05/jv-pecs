package core.mate.academy.model;

public class Truck extends Machine {

    private final int loadCapacity;

    public Truck(String model, int loadCapacity) {
        super(model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + getModel()
                + " transports load " + loadCapacity);
    }
}
