package web.model;

public class Car {
    private String make;
    private String model;
    private int years;

    public Car(String make, String model, int years) {
        this.make = make;
        this.model = model;
        this.years = years;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", years=" + years +
                '}';
    }
}
