public class Main {
        public static void main(String[] args) {
                Employee[] employees = new Employee[10];
                employees[0] = new Employee("Иванов Иван Иванович", 1, 41400f);
                employees[1] = new Employee("Сидоров Сидор Сидорович", 2, 58450f);
                employees[2] = new Employee("Петров Петр Петрович", 3, 45200f);
                employees[3] = new Employee("Иванов Сергей Федорович", 4, 37450f);
                employees[4] = new Employee("Сергеев Иван Степанович", 5, 42200f);
                employees[5] = new Employee("Перевертов Иван Иванович", 6, 45400f);
                employees[6] = new Employee("Петренко Сидор Сидорович", 7, 52450f);
                employees[7] = new Employee("Сизов Петр Петрович", 8, 47200f);
                employees[8] = new Employee("Андреев Сергей Федорович", 9, 32450f);
                employees[9] = new Employee("Александров Иван Степанович", 10, 49200f);

               print(employees);
               System.out.println("Сумма затрат в месяц " + sumSalary (employees));
                System.out.println("Среднее значение зарплат " + averageSalary (employees));
                 minSalary(employees);
                 maxSalary(employees);
                System.out.println();
        }

                private static void print(Employee[] employees) {
                for (Employee employee : employees) {
                        if (employee != null) {
                                System.out.println(employee);
                        }
                }
        }
        private static void maxSalary(Employee[] employees) {
                int max = 0;
                for (Employee employee : employees) {
                        if (employee != null) {
                                max = (int) Math.max(max, employee.getSalary());
                        }
                }
                for (Employee employee : employees){
                        if (employee.getSalary() == max){
                                System.out.println("Сотрудник с наибольшей зарплатой " + employee);
                                break;
                        }
                }
        }
        private static void minSalary(Employee[] employees) {
                int min = 99999999;
                for (Employee employee : employees) {
                        if (employee != null) {
                                min = (int) Math.min(min, employee.getSalary());
                        }
                }
                for (Employee employee : employees){
                        if (employee.getSalary() == min){
                                System.out.println("Сотрудник с наименьшей зарплатой " + employee);
                                break;
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
                        if (employee != null && employee.getSalary()!=0) {
                                average += employee.getSalary();
                                count++;

                        }
                }
                return (int) ((float) average/count);
        }


        }

