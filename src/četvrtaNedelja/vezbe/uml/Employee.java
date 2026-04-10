package četvrtaNedelja.vezbe.uml;

public class Employee {
    private String name;
    private int employeeNumber;
    private int salary;
    private Manager manager;

    public Employee(String name,int employeeNumber,int salary){
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", salary=" + salary +
                ", manager=" + manager +
                '}';
    }
}
