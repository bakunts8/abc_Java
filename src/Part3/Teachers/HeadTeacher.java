package Part3.Teachers;

public class HeadTeacher extends Teacher {

    private final float coefficient;

    HeadTeacher(float coefficient) {
        if (coefficient < 1.5 || coefficient > 2) {
            System.out.println("invalid coefficient, run again and input from 1.5 - 2 range");
            System.exit(1);
        }
        this.coefficient = coefficient;
    }


    @Override
    public double getSalary() {
        return super.getSalary() * coefficient;
    }
}
