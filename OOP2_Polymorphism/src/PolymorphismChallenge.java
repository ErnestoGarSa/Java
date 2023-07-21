//public class PolymorphismChallenge {
//
//    public static void main(String[] args) {
//
//        Car car = new Car("Toyota");
//        car.startEngine();
//        car.drive();
//        car.runEngine();
//
//        Car gas = new GasPoweredCar("Toyota",15,4);
//        gas.startEngine();
//        gas.drive();
//        gas.runEngine();
//
//        Car electric = new ElectricCar("Toyota",15,4);
//        electric.startEngine();
//        electric.drive();
//        electric.runEngine();
//
//        Car hibrid = new HibridCar("Toyota",15,4,4);
//        hibrid.startEngine();
//        hibrid.drive();
//        hibrid.runEngine();
//
//    }
//
//
//}
//
//class Car {
//    private String description;
//
//    public Car(String description) {
//        this.description = description;
//    }
//
//    public void startEngine() {
//        System.out.println("Starting the car engine");
//    }
//
//    public void drive() {
//        System.out.println("Driving car");
//    }
//
//    protected void runEngine() {
//        System.out.println("Running car engine");
//    }
//
//}
//
//class GasPoweredCar extends Car {
//
//    private double avgKmPerLiter;
//
//    private int cilinders;
//
//    public GasPoweredCar(String description) {
//        super(description);
//    }
//
//    public GasPoweredCar(String description, double avgKmPerLiter, int cilinders) {
//        super(description);
//        this.avgKmPerLiter = avgKmPerLiter;
//        this.cilinders = cilinders;
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("Starting the gas car engine");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("Driving the gas car");
//    }
//
//    @Override
//    protected void runEngine() {
//        System.out.println("Running gas car engine");
//    }
//}
//
//class ElectricCar extends Car {
//    private double avgKmPerCharge;
//
//    private int batterySize;
//
//    public ElectricCar(String description) {
//        super(description);
//    }
//
//    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
//        super(description);
//        this.avgKmPerCharge = avgKmPerCharge;
//        this.batterySize = batterySize;
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("Starting the electric car engine");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("Driving the electric car");
//    }
//
//    @Override
//    protected void runEngine() {
//        System.out.println("Running electric car engine");
//    }
//
//}
//
//class HibridCar extends Car {
//    private double avgKmPerLiter;
//    private int batterySize;
//    private int cylinders;
//
//    public HibridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
//        super(description);
//        this.avgKmPerLiter = avgKmPerLiter;
//        this.batterySize = batterySize;
//        this.cylinders = cylinders;
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("Starting the hibrid car engine");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("Driving the hibrid car");
//    }
//
//    @Override
//    protected void runEngine() {
//        System.out.println("Running hibrid car engine");
//    }
//
//}
