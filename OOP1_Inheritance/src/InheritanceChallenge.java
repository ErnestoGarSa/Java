public class InheritanceChallenge {

    public static void main(String[] args) {

        Employee ernesto = new Employee("Ernesto", "03/01/1990", "04/09/2021");
        System.out.println(ernesto);
        System.out.println("Age = " + ernesto.getAge());
        System.out.println("Pay = " + ernesto.collectPay());

        SalariedEmployee alejandro = new SalariedEmployee("Aleljandro", "03/01/1990", "04/09/2021", 35000);
        System.out.println(alejandro);
        System.out.println("Alejandro´s paycheck = $ " + alejandro.collectPay());

        alejandro.retire();
        System.out.println("Alejandro´s pension check = $ " + alejandro.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "03/01/1970", "04/09/2022", 15);
        System.out.println(mary);
        System.out.println("Mary´s paycheck = $ " + mary.collectPay());
        System.out.println("Mary´s holyday = $ " + mary.getDoublePay());

    }

}

class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return 2023 - Integer.parseInt(birthDate.substring(6));
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? .9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

}

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return collectPay() * 2;
    }
}
