package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl<T extends Machine>
        implements MachineService<T> {

    private final MachineProducer<Bulldozer> bulldozerProducer =
            new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer =
            new ExcavatorProducer();
    private final MachineProducer<Truck> truckProducer =
            new TruckProducer();

    @Override
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
        throw new RuntimeException("Unsupported machine type");
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
