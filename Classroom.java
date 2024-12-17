public class Classroom {
    public static void main(String[] args) {
        Wilder didier = new Wilder("Didier", true);
        Wilder cunegonde = new Wilder("Cunegonde", false);

        System.out.println(didier.WhoAmI());
        System.out.println(cunegonde.WhoAmI());
    }
}
