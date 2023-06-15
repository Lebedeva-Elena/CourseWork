public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private int id;

    public static int idCounter = 1;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        this.idCounter++;

    }
    private Employee[] employees;
    public Employee() {
        int[] employees = new int[10];

    }

    public String getFullName() {
        return fullName;

    }

    public int getDepartment() {

        return department;
    }

    public int getId() {
        return id;
    }
    public static int getIdCounter() {
        return idCounter;
    }
    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id: " + "Сотрудник " + getFullName() + " из " + getDepartment() + " отдела получает " + getSalary() + " рублей";
    }

}





            




