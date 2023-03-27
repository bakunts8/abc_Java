package Part3.Teachers;

public class MainTeacher {

    public static void main(String[] args) {

        SchoolDirector director = new SchoolDirector();
        System.out.println(director.getSalary());

        Teacher[] teachers = {new Teacher(), new HeadTeacher(1.7f)};
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getSalary());
        }

    }
}
