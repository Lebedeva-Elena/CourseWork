import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 17500);
        employees[1] = new Employee("Сидоров Андрей Николаевич", 5, 20000);
        employees[2] = new Employee("Петров Владимир Александрович", 4, 23500);
        employees[3] = new Employee("Соколов Петр Алексеевич", 3, 16500);
        employees[4] = new Employee("Захаров Сергей Петрович", 2, 15000);
        employees[5] = new Employee("Алексеев Александр Павлович", 4, 18000);
        employees[6] = new Employee("Зернов Антон Артемьевич", 2, 30000);
        employees[7] = new Employee("Свиридов Евгений Константинович", 2, 27000);
        employees[8] = new Employee("Жданов Артем Игоревич", 3, 19000);
        employees[9] = new Employee("Сергеев Николай Романович", 1, 25000);

        printListAllEmployee(employees);
        calculateSalariesAllEmployee(employees);
        calculateMaxSalariesAllEmployee(employees);
        calculateMinSalariesAllEmployee(employees);
        calculateAverageSalariesEmployee(employees);
        printListFulNameEmployee(employees);


        System.out.println();
    }

    public static void printListAllEmployee(Employee[] employees) {
        System.out.println("Книга сотрудников");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + 1 + employees[i].toString());
        }
        System.out.println();
    }

    public static int calculateSalariesAllEmployee(Employee[] employees) {
        int salariesAllEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            salariesAllEmployee += employees[i].getSalary();
        }
        System.out.println("Затраты на сотрудников за месяц составило " + salariesAllEmployee + " рублей");

        return salariesAllEmployee;
    }

    public static void calculateMaxSalariesAllEmployee(Employee[] employees) {
        int maxSalaryEmployee = employees[0].getSalary();
        int maxSalaryEmployeeIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee) {

                maxSalaryEmployee = employees[i].getSalary();
                maxSalaryEmployeeIndex = i;
            }
        }
        System.out.println("Сотрудник " + employees[maxSalaryEmployeeIndex].getFullName() + " " +
                "получает максимальную зарплату " + employees[maxSalaryEmployeeIndex].getSalary() + " рублей");

    }

    public static void calculateMinSalariesAllEmployee(Employee[] employees) {
        int minSalaryEmployee = employees[0].getSalary();
        int minSalaryEmployeeIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee) {

                minSalaryEmployee = employees[i].getSalary();
                minSalaryEmployeeIndex = i;
            }
        }
        System.out.println("Сотрудник " + employees[minSalaryEmployeeIndex].getFullName() + " " +
                "получает минимульную зарплату " + employees[minSalaryEmployeeIndex].getSalary() + " рублей");

    }

    public static int calculateAverageSalariesEmployee(Employee[] employees) {
        int salariesAllEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            salariesAllEmployee += employees[i].getSalary();
        }
        int averageSalariesAllEmployee = salariesAllEmployee / employees.length;

        System.out.println("Среднее значение затрат на сотрудников за месяц составило " + averageSalariesAllEmployee + " рублей");

        return averageSalariesAllEmployee;
    }

    public static int printListFulNameEmployee(Employee[] employees) {
        System.out.println();
        System.out.println("Список сотрудников ФИО");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
        return 0;
    }
}


























