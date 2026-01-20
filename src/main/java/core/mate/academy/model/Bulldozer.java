package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;

    public Bulldozer(String model, int bladeWidth) {
        super(model);
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer working. Blade width: " + bladeWidth);
    }
}

