public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 41400f);
        employees[1] = new Employee("Сидоров Сидор Сидорович", 2, 58450f);
        employees[2] = new Employee("Петров Петр Петрович", 3, 44200f);
        employees[3] = new Employee("Иванов Сергей Федорович", 4, 33450f);
        employees[4] = new Employee("Сергеев Иван Степанович", 5, 72200f);
        employees[5] = new Employee("Перевертов Иван Иванович", 6, 24200f);
        employees[6] = new Employee("Петренко Сидор Сидорович", 7, 12450f);
        employees[7] = new Employee("Сизов Петр Петрович", 8, 73200f);
        employees[8] = new Employee("Андреев Сергей Федорович", 9, 14450f);
        employees[9] = new Employee("Александров Иван Степанович", 10, 17220f);

        printInfo(employees);

        System.out.println("Сумма затрат в месяц " + sumSalary(employees));

        System.out.println("Среднее значение зарплат " + averageSalary(employees));

        printFullName(employees);

        System.out.println(foundMinSalaryEmployee(employees));

        System.out.println(foundMaxSalaryEmployee(employees));
    }

    private static Employee foundMaxSalaryEmployee(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        System.out.println();
        System.out.println("Сотрудник с наибольшей зарплатой: ");
        return employeeWithMaxSalary;
    }

    private static Employee foundMinSalaryEmployee(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        System.out.println();
        System.out.println("Сотрудник с наименьшей зарплатой: ");
        return employeeWithMinSalary;
    }

    private static void printInfo(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void printFullName(Employee[] employees) {
        System.out.println();
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static float sumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static float averageSalary(Employee[] employees) {
        float sum = sumSalary(employees);
        float average = (float) sum / employees.length;
        return average;
    }
}

