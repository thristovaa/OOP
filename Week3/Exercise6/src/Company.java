import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Company {
    private String name;

    private ArrayList<Employee> employees;

    private long totalWorkMinutes;

    public Company(String name) {
        this.name = name;
        this.employees = loadEmployeeData();
    }

    private ArrayList<Employee> loadEmployeeData() {
        ArrayList<Employee> result = new ArrayList<>();

        return result;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public long getTotalWorkMinutes() {
        return totalWorkMinutes;
    }

    public void registerWork(int employee, String task, LocalDateTime start, LocalDateTime end) {

    }
}
