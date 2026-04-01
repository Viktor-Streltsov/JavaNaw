public class Main {
    public static void main(String[] args) {
        Car KIA = new Car("Kia", "Storeh", 2004, 12334455);
        Car BMV = new Car("Bmv", "V8", 2015, 89457349);

        KIA.displayInfo();
        KIA.applyDiscount(15);
        KIA.getCarAge(KIA.getYears());
        KIA.priceComparison(
                KIA.getPrice(),
                KIA.getModel(),
                BMV.getPrice(),
                BMV.getModel()
        );
    }
}