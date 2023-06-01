package employee.employeelist.Controllers;

public class EmployeeModel {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public EmployeeModel(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String getName() {
        return firstName + lastName;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public int raiseSalary(int percent) {
        return (1 + percent/100)*salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + firstName + lastName + ", salary=" + salary
                + "]";
    }
}
