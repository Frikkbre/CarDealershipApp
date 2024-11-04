package inventory;

import java.util.HashMap;
import java.util.Iterator;

public class CarInventory {
    private HashMap<String, Car> carRegistry;

    public CarInventory(HashMap<String, Car> mjøsBilRegistry) {


        carRegistry = mjøsBilRegistry;

    }

    public boolean addCarToInventory(String carToBeAdded) {
        boolean wasAdded = false;
        if (carRegistry.containsKey(carToBeAdded.getRegistrationNumber())) {
            throw new IllegalArgumentException("Car with registration number " + carToBeAdded.getRegistrationNumber() + " already exists in the registry");
            wasAdded = false;
        }
        carRegistry.put(carToBeAdded.getRegistrationNumber(), carToBeAdded);
        wasAdded = true;

        return wasAdded;
    }

    Iterator<Car> returnRegisterIterator()
    {
        return carRegistry.values().iterator();
    }


    Iterator<Car> sortedList()
    {
        return carRegistry.values().stream().sorted().toList().iterator();
    }
}
