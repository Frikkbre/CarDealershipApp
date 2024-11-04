package printUtility;

import java.util.Iterator;

public class UIPrintHandler
{

    public void printCarInformation(Iterator<Car> carIterator)
    {
        while (carIterator.hasNext())
        {
            Car car = carIterator.next();
            System.out.println(car.getRegistrationNumber()
                    + car.getCarBrand()
                    + car.getColor());
        }
    }
}
