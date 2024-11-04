import java.time.LocalDate;



public class Car {
    private String registrationNumber;
    private int year;
    private String color;
    private boolean isAutomatic;
    private String fuelType;
    private double price;
    private int horsepower;
    private String make;
    private String model;

    private final int CARLOWESTYEAR = 1900;
    private final int CARHIGHESTYEAR = LocalDate.now().getYear();



    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < CARLOWESTYEAR || year > CARHIGHESTYEAR) {
            throw new IllegalArgumentException("Year must be between " + CARLOWESTYEAR + " and " + CARHIGHESTYEAR);
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car(String registrationNumber, int year, boolean isAutomatic, String color, String fuelType, double price, String model, String make, int horsepower) {
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.isAutomatic = isAutomatic;
        this.color = color;
        this.fuelType = fuelType;
        this.price = price;
        this.model = model;
        this.make = make;
        this.horsepower = horsepower;
    }

    public Car(){

    }



    Car car1 = new Car(){
        car1.setRegistrationNumber("");
        car1.setYear(2008);
        car1.setAutomatic(false);
        car1.setColor("Black");
        car1.setFuelType("Diesel");
        car1.setPrice(700000);
        car1.setModel("TT");
        car1.setMake("Audi");
        car1.setHorsepower(200);
    }

}
