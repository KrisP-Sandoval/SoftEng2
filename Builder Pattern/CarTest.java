public class CarTest {

    public static void main(String[] args) {

        Car myCar = new Car.CarBuilder()
                
                .transmission("Radio")
                .engineType("Jet Engine")
                .capacity(5)
                .color("Metallic Violet")
                .brand("Honda")
                .build();

        System.out.println(myCar.getBrand());
        System.out.println("");

        System.out.println(myCar.getEngineType());
        System.out.println("");

        System.out.println(myCar.getTransmission());
        System.out.println("");

        System.out.println(myCar.getColor());
        System.out.println("");

        System.out.println(myCar.getCapacity());
        System.out.println("");


    }
}
