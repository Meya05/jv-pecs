package core.mate.academy.model;

public class Excavator extends Machine {

    private final int bucketCapacity;

    public Excavator(String model, int bucketCapacity) {
        super(model);
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getModel()
                + " digs with bucket capacity " + bucketCapacity);
    }
}
