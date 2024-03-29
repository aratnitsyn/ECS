package ru.ras.ecs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ras.ecs.repository.ElevatorRepository;

@Service
public class ElevatorService {

    @Autowired
    private ElevatorWorkingComponent elevatorWorkingComponent;

    public ElevatorService() {

    }

    public String call(int goToFloor) {
        return elevatorWorkingComponent.call(goToFloor);
    }

    public String get() {
        return elevatorWorkingComponent.get();
    }

}