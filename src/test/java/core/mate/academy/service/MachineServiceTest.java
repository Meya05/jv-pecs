package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MachineServiceTest {

    private final MachineService<Machine> service =
            new MachineServiceImpl<>();

    @Test
    void getAll_shouldReturnBulldozers() {
        List<? extends Machine> machines =
                service.getAll(Bulldozer.class);

        assertNotNull(machines);
        assertFalse(machines.isEmpty());
        assertTrue(machines.get(0) instanceof Bulldozer);
    }

    @Test
    void fill_shouldReplaceAllElements() {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Bulldozer("Old", 3));
        machines.add(new Bulldozer("Old", 4));

        Truck truck = new Truck("New", 20);

        service.fill(machines, truck);

        for (Machine machine : machines) {
            assertSame(truck, machine);
        }
    }

    @Test
    void startWorking_shouldNotThrowException() {
        List<? extends Machine> machines =
                service.getAll(Bulldozer.class);

        assertDoesNotThrow(() ->
                service.startWorking(machines)
        );
    }
}
