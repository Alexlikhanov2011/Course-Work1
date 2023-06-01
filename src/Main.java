public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 41400f);
        employees[1] = new Employee("Сидоров Сидор Сидорович", 2, 58450f);
        employees[2] = new Employee("Петров Петр Петрович", 3, 25200f);
        employees[3] = new Employee("Иванов Сергей Федорович", 4, 17450f);
        employees[4] = new Employee("Сергеев Иван Степанович", 5, 72200f);
        employees[5] = new Employee("Перевертов Иван Иванович", 6, 5400f);
        employees[6] = new Employee("Петренко Сидор Сидорович", 7, 52450f);
        employees[7] = new Employee("Сизов Петр Петрович", 8, 47200f);
        employees[8] = new Employee("Андреев Сергей Федорович", 9, 32450f);
        employees[9] = new Employee("Александров Иван Степанович", 10, 49200f);

        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        print(employees);

        System.out.println("Сумма затрат в месяц " + sumSalary(employees));

        System.out.println("Среднее значение зарплат " + averageSalary(employees));

        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
        System.out.println("Сотрудник с наименьшей зарплатой: " + employeeWithMinSalary);

        print2(employees);

    }


    private static void print(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void print2(Employee[] employees) {
        System.out.println();
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }

    }

    private static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static int averageSalary(Employee[] employees) {
        int count = 0;
        float average = 0.0f;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() != 0) {
                average += employee.getSalary();
                count++;

            }
        }
        return (int) ((float) average / count);
    }


}

