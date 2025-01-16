package SingletonPattern;

public class ToyotaImpl implements CarService {

    private String color, model, year, brand;

    public ToyotaImpl() {
        this.color = "Red";
        this.model = "Corolla";
        this.year = "2021";
        this.brand = "Toyota";
    }

    @Override
    public String carColor() {
        return this.color;
    }

    @Override
    public String carModel() {
        return this.model;
    }

    @Override
    public String carYear() {
        return this.year;
    }

    @Override
    public String carBrand() {
        return this.brand;
    }


    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
