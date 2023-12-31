public class Person {

//    Person
//    Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
//    Write the following methods (instance methods):
//    Method named getFirstName without any parameters, it needs to return the value of the firstName field.
//    Method named getLastName without any parameters, it needs to return the value of the lastName field.
//    Method named getAge without any parameters, it needs to return the value of the age field.
//    Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
//    Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
//    Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
//    Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
//    Method named getFullName without any parameters, it needs to return the full name of the person.
//    In case both firstName and lastName fields are empty, Strings return an empty String.
//            In case lastName is an empty String, return firstName.
//            In case firstName is an empty String, return lastName.
//    To check if s String is empty, use the method isEmpty from the String class. For example,firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.


//    NOTE: All ​methods should be defined as public NOT public static.
//    NOTE: In total, you have to write 8 methods.
//            NOTE: Do not add the main method to the solution code.

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        if (this.getAge() < 13 || this.getAge() > 19) {
            return false;
        }
        return true;
    }

    public String getFullName() {
        if (this.getLastName().isEmpty() && this.getFirstName().isEmpty()) {
            return "";
        } else if (this.getLastName().isEmpty()) {
            return this.getFirstName();
        } else if (this.getFirstName().isEmpty()) {
            return this.getLastName();
        } else {
            return (this.getFirstName() + " " + this.getLastName());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
