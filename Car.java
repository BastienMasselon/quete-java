public class Car extends Vehicle {

    public Car(String brand, int kilometers ) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return String.format("Je suis %s et je fais VROUM VROUM !", this.getBrand());
    }
}
