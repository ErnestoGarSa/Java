public class ExercisesOutputs {
    public static void main(String[] args) {

        //        TEST EXAMPLE
//        TEST CODE:
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        //        OUTPUT
        //                fullName=
        //                teen= false
        //        fullName= John
        //        teen= true
        //        fullName= John Smith


        //        TEST EXAMPLE
        //        TEST CODE:
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        //        OUTPUT
        //                add= 9.0
        //        subtract= 1.0
        //        multiply= 0.0
        //        divide= 0.0
        //        TIPS:
        //        add= 9.0 is printed because 5.0 + 4 is 9.0
        //        subtract= 1.0 is printed because 5.0 - 4 is 1.0
        //        multiply= 0.0 is printed because 5.25 * 0 is 0.0
        //        divide= 0.0 is printed because secondNumber is set to 0

        //        TEST EXAMPLE
        //→ TEST CODE:
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        //→ OUTPUT:
        //        area= 20.0
        //        width= 5.0
        //        height= 0.0
        //        area= 0.0

        //            TEST EXAMPLE
        //→ TEST CODE:
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println(second);
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        //    OUTPUT
        //    distance(0,0)= 7.810249675906654
        //    distance(second)= 5.0
        //    distance(2,2)= 5.0
        //    distance()= 0.0

        //            TEST EXAMPLE
        //→ TEST CODE:
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        //→ OUTPUT
        //            total= 38.5
        //    total= 36.45

        //    TEST EXAMPLE
        //→ TEST CODE:
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        //→ OUTPUT
        //    one.real= 2.0
        //    one.imaginary= 2.0
        //    one.real= -0.5
        //    one.imaginary= 3.5
        //    number.real= 3.0
        //    number.imaginary= -5.0


    }

}
