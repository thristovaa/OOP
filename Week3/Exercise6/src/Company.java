import java.util.ArrayList;

public class Company {
    private String name;

    private ArrayList<Employee> employees;

    private long totalWorkMinutes;

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public long getTotalWorkMinutes() {
        return totalWorkMinutes;
    }
}
