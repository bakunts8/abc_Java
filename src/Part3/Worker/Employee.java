package Part3.Worker;

public class Employee extends Person {

    private String specialization;
    private int salary;

    Employee() {
    }

    Employee(String n, String s, int age, String a, String p, String sp, int sal) {
        setName(n);
        setSurname(s);
        setAge(age);
        setAddress(a);
        setPhoneNumber(p);
        setSpecialization(sp);
        setSalary(sal);
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }
}
