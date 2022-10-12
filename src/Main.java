import java.sql.Array;
import java.sql.SQLOutput;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 34000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 25444);
        employees[2] = new Employee("Волкова Анастасия Юрьевна", 3, 56222);
        employees[3] = new Employee("Кузьмина Любовь Юрьевна", 4, 32111);
        employees[4] = new Employee("Кузнецов Павел Николаевич", 5, 451234);
        employees[5] = new Employee("Литвинов Кирилл Кириллович", 5, 78333);
        employees[6] = new Employee("Гвоздь Сергей Денисович", 1, 67432);
        employees[7] = new Employee("Клемов Александр Денисович", 2, 65433);
        employees[8] = new Employee("Гонцов Антон Геннадьевич", 3, 78433);
        employees[9] = new Employee("Тюфтяев Александр Александрович", 4, 32111);

        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].toString());



        System.out.println("Сумма все зарплат за месяц " + amountOfSalaries());
        System.out.println("Сотрудник с максимальной зарплатой " + getMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + getMinSalary());
        System.out.println("Cреднее значение зарплат за месяц " + averageSalary());
        System.out.println(displayListFullName());


    }

    public static int amountOfSalaries() {
        int sum = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;

            }
        }
        return targetEmployee;
    }

    public static double averageSalary() {
        double sum = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum / employees.length;
    }

    public static String displayListFullName () {
        String listEmployees = " ";
        for (Employee employee : employees) {

            System.out.println(employee.getFullName());
        }
        return listEmployees;
    }}

