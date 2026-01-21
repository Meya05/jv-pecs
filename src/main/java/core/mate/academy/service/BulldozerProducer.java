package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("CAT D9", 5),
                new Bulldozer("Komatsu D85", 6)
        );
    }
}

