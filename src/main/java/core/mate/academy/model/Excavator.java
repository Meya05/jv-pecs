package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator(String model, int bucketCapacity) {
        super(model);
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator working. Bucket capacity: " + bucketCapacity);
    }
}

