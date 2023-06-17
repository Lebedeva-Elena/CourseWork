public class Employee {
    public double getSalary;
    private String surname;
    private String name;
    private String patronymic;
    private double salary;
    private int department;
    private static int idCounter = 1;
    private int id;


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }


    public int getDepartment() {

        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {


        return salary;
    }

    public Employee(String surname, String name, String patronymic, int department,
                    double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;


    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }

    public  String getFullName() {
        return  "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic;
    }
}






            




