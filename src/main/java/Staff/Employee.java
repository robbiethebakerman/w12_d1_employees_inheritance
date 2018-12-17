package Staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void raiseSalary(double raiseAmount) {
        if (raiseAmount >= 0) {
            salary += raiseAmount;
        }
    }

    public double payBonus() {
        return salary * 0.01;
    }
}
