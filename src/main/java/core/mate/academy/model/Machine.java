package core.mate.academy.model;

public abstract class Machine {

    private final String model;

    protected Machine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void doWork();
}
