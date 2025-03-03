import java.util.ArrayList;

public class Teacher extends Person{
    private String teacherCode;
    private ArrayList<Student> mentorStudents;

    public Teacher(String firstName, String lastName){
        super(firstName, lastName);

        this.teacherCode = generateTeacherCode();
        this.mentorStudents = new ArrayList<>();
    }

    private String generateTeacherCode() {
        return ("" + getFirstName().charAt(0) + getLastName().charAt(0) + getLastName().charAt(1));
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    private void addMentorStudents(Student s) {
        mentorStudents.add(s);
    }
}
