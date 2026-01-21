package core.mate.academy.model;

public class Bulldozer extends Machine {

    private final int bladeWidth;

    public Bulldozer(String model, int bladeWidth) {
        super(model);
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getModel()
                + " works with blade width " + bladeWidth);
    }
}
