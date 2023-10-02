public class ComputerProcessor {


    public String brand;
    public String model;
    public String speed;
    public Double price;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComputerProcessor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", price=" + price +
                '}';
    }
}
