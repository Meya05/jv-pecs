package core.mate.academy.service;

import core.mate.academy.model.*;
import java.util.List;

public class MachineServiceImpl<T extends Machine>
        implements MachineService<T> {

    @Override
    @SuppressWarnings("unchecked")
    public List<? extends T> getAll(Class<? extends T> type) {

        if (type == Bulldozer.class) {
            return (List<? extends T>) new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            return (List<? extends T>) new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            return (List<? extends T>) new TruckProducer().get();
        }
        throw new IllegalArgumentException("Unsupported machine type");
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
