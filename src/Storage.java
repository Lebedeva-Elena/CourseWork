public class Storage {
    private Employee[] employees = new Employee[10];

    public Storage() {
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 17500);
        employees[1] = new Employee("Сидоров", "Андрей", "Николаевич", 5,
                20000);
        employees[2] = new Employee("Петров", "Владимир", "Александрович", 4,
                23500);
        employees[3] = new Employee("Соколов", "Петр", "Алексеевич", 3,
                16500);
        employees[4] = new Employee("Захаров", "Сергей", "Петрович", 2,
                15000);
        employees[5] = new Employee("Алексеев", "Александр", "Павлович", 4,
                18000);
        employees[6] = new Employee("Зернов", "Антон", "Артемьевич", 2,
                30000);
        employees[7] = new Employee("Свиридов", "Евгений", "Константинович", 2,
                27000);
        employees[8] = new Employee("Жданов", "Артем", "Игоревич", 3,
                19000);
        employees[9] = new Employee("Сергеев", "Николай", "Романович", 1,
                25000);
    }

    public void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public double calculateAllSalaries() {
        double salariesAllEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            salariesAllEmployee += employees[i].getSalary();
        }

        return salariesAllEmployee;
    }

    public Employee findPoorEmployee() {
        Employee poorEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < poorEmployee.getSalary()) {
                poorEmployee = employees[i];
            }
        }
        return poorEmployee;

    }

    public Employee findRichEmployee() {
        Employee richEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > richEmployee.getSalary()) {
                richEmployee = employees[i];
            }
        }
        return richEmployee;

    }

    public double calculateAverageSalary() {

        return calculateAllSalaries() / employees.length;
    }

    public void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}