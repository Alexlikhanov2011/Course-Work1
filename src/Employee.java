public class Employee {
    private String FullName;
    private int Departament;
    private float Salary;
    private static int Counter;
    private int Id;

    public String getFullName() {
        return this.FullName;
    }

    public int getDepartament() {
        return this.Departament;
    }

    public float getSalary() {
        return this.Salary;
    }


    public int getId() {
        return this.Id;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public void setDepartament(int departament) {
        this.Departament = departament;
    }

    public void setSalary(float salary) {
        this.Salary = salary;
    }
    public Employee (String fullName, int departament, float salary){
     FullName=fullName;
     Departament = departament;
    Salary = salary;
    Id=Counter++;
        if (salary>=0) {
            this.Salary = Salary;
        }
    }
    @Override
    public String toString() {
        return "Id: " + Id + " Фамилия Имя Отчество: " + FullName + " Отдел: " + Departament + " Зарплата: " + Salary;
    }

}
