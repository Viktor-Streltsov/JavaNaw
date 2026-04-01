import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private int years;
    private int price;

    public Car() {

    }

    public Car(String brand, String model, int years, int price) {
        this.brand = brand;
        this.model = model;
        this.years = years;
        this.price = price;
    }

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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand + " Модель: " + model + " Год выпуска: " + years + " Цена: " + price);
    }

    public void applyDiscount(double percent) {
        double discountPrice = (price * percent) / 100;
        System.out.println("Скидака на машину состовляет " + percent + "% от суммы " + price + " и того " + discountPrice);
    }

    public void getCarAge(int toYears) {
        int yearsCar = LocalDate.now().getYear() - toYears;

        System.out.println("Ваозрост машины состовляет " + yearsCar);
    }

    public void priceComparison(int onePriceCar, String modelOne, int twoPriceCar, String modelTwo) {
        if (onePriceCar > twoPriceCar) {
            System.out.println("Машина " + modelOne + " дороже чем " + modelTwo);
        } else {
            System.out.println("Машина " + modelTwo + " дороже чем " + modelOne);
        }
    }
}
