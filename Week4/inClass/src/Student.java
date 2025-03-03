public class Student extends Person{
    private int studentNr;

    public Student (String firstName, String lastName, int studentNr) {
        super (firstName, lastName);
        this.studentNr = studentNr;
    }

    public int getStudentNr() {
        return studentNr;
    }
}
