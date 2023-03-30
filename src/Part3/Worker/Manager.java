package Part3.Worker;

public class Manager extends Employee {

    private String department;

    Manager() {
        setSpecialization("manager");
    }

    Manager(String n, String s, int age, String a, String p, int sal, String d) {
        setSpecialization("manager");

        setName(n);
        setSurname(s);
        setAge(age);
        setAddress(a);
        setPhoneNumber(p);
        setSalary(sal);
        setDepartment(d);
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }
}
