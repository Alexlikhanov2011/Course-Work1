
public class Employee {
    private String fullName;
    private int departament;
    private float salary;
    private static int counter;
    private int id;


    public Employee(String fullName, int departament, float salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartament() {
        return this.departament;
    }

    public float getSalary() {
        return this.salary;
    }


    public int getId() {
        return this.id;
    }

    public void setDepartament(int departament1) {
        this.departament = departament1;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Фамилия Имя Отчество: " + fullName + " Отдел: " + departament + " Зарплата: " + salary;
    }

}
