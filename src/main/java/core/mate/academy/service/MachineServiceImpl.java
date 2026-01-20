package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    @SuppressWarnings("unchecked")
    public List<? extends T> getAll(Class<? extends T> type) {

        if (type == Bulldozer.class) {
            return (List<? extends T>) bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            return (List<? extends T>) excavatorProducer.get();
        }
        if (type == Truck.class) {
            return (List<? extends T>) truckProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
