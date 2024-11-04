import java.util.HashMap;

public class CarInventory {
    private HashMap<Car> carRegistry;

    public CarInventory(HashMap<String, Car> mjøsBilRegistry) {

        carRegistry = mjøsBilRegistry;

    }

    public boolean addCarToInventory(String carToBeAdded){
        boolean wasAdded = false;
        if (carRegistry.containsKey(carToBeAdded.getRegistrationNumber())){
            throw new IllegalArgumentException("Car with registration number " + carToBeAdded.getRegistrationNumber() + " already exists in the registry");
            wasAdded = false;
        }
        carRegistry.put(carToBeAdded.getRegistrationNumber(), carToBeAdded);
        wasAdded = true;

        return wasAdded;
    }
}
