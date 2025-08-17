package builderPatternExample;

public class Test {

    public static void main(String[] args) {
        Computer C1 = new Computer.Builder("AMD Ryzen 9", "1 TB", "16 GB").enableGraphicsCard("ROG").enableBluetooth("SONY").build();
        System.out.println(C1);

        Computer C2 = new Computer.Builder("Intel i5", "500 GB", "8 GB").enableBluetooth("SONY").build();
        System.out.println(C2);
    }
}
