import java.util.ArrayList;
public class Main {
        private static void print(Employee[] arr) {
                for (Employee employee : arr) {
                        if (employee != null) {
                                System.out.println(employee + " ");
                        }
                }
        }
        private static int sumSalary(Employee[] arr) {
                int sum = 0;
                for (Employee employee : arr) {
                        if (employee != null) {
                                sum += employee.getSalary();
                        }
                }
                return sum;
        }

        private static void maxSalary(Employee[] arr) {
                int max = 0;
                for (Employee employee : arr) {
                        if (employee != null) {
                                max = (int) Math.max(max, employee.getSalary());
                        }
                }
                for (Employee employee : arr){
                        if (employee.getSalary() == max){
                                System.out.println("Сотрудник с наибольшей зарплатой " + employee);
                                break;
                        }
                }
        }
        private static void minSalary(Employee[] arr) {
                int min = 99999999;
                for (Employee employee : arr) {
                        if (employee != null) {
                                min = (int) Math.min(min, employee.getSalary());
                        }
                }
                for (Employee employee : arr){
                        if (employee.getSalary() == min){
                                System.out.println("Сотрудник с наименьшей зарплатой " + employee);
                                break;
                        }
                }
        }
        public static void main(String[] args) {
                Employee[] employee = new Employee[5];
                employee[0] = new Employee("Иванов Иван Иванович", 1,41400f);
                employee[1] = new Employee("Сидоров Сидор Сидорович", 2, 58450f);
                employee[2] = new Employee("Петров Петр Петрович", 3, 45200f);
                employee[3] = new Employee("Иванов Сергей Федорович", 4, 37450f);
                employee[4] = new Employee("Сергеев Иван Степанович", 5, 42200f);
               print(employee);
                System.out.println("Сумма затрат в месяц " + sumSalary (employee));
              minSalary(employee);
              maxSalary(employee);
                System.out.println();
        }

}

