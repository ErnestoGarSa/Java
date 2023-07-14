public class Dog {

    private static String name;

    public Dog(String name){
        Dog.name= name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        Dog rex= new Dog("rex"); //Create instance (rex)
        Dog fluffy = new Dog("fluffy"); //Create instance (fluffy)
        rex.printName(); //Prints fluffy
        fluffy.printName(); //Prints fluffy
    }

}

