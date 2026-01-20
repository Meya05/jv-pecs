package core.mate.academy.model;

public abstract class Machine implements Workable {
    protected String model;

    public Machine(String model) {
        this.model = model;
    }
}

