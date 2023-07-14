public class TestClasses {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("make = "+ car.getMake());
        System.out.println("color = "+ car.getColor());

        car.setMake("Porsche");
        System.out.println("make = "+ car.getMake());

        car.describeCar();
    }
}
