public class CompositionChallenge {


    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaker().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaker().brewCoffee();

        kitchen.setKitchenState(true, false, true);

        kitchen.doKitchenWork();

    }

}

class SmartKitchen {

    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeMaker brewMaker;

    public SmartKitchen() {
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaker = new CoffeMaker();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeMaker getBrewMaker() {
        return brewMaker;
    }

    public void addWater() {
        brewMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean iceBoxWorking, boolean dishWasherWorking, boolean brewMakerWorking) {
        iceBox.setHasWorkToDo(iceBoxWorking);
        dishWasher.setHasWorkToDo(dishWasherWorking);
        brewMaker.setHasWorkToDo(brewMakerWorking);
    }

    public void doKitchenWork() {
        brewMaker.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing the dishes");
            hasWorkToDo = false;
        }
    }

}

class CoffeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }

}
