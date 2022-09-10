public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int count;

    // геттеры
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    //сеттеры

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Отдела не существует");
            return;
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // конструктор
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++count;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Department: " + department + " | Full Name: " + fullName + " | Salary: " + salary;
    }
}
