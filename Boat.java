public class Boat extends Vehicle {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return String.format("Je suis %s et je fais glou glou !", this.getBrand());
    }
}
