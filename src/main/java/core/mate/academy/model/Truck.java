package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;

    public Truck(String model, int loadCapacity) {
        super(model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck working. Load capacity: " + loadCapacity);
    }
}

