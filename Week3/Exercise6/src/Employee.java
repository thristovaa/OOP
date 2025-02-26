import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    private String name;
    private long employeeNumber;

    private ArrayList<Work> works;

    private long totalWorkHours;
    private long totalWorkMinutes;

    public String getName() {
        return name;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public long getTotalWorkHours() {
        return totalWorkHours;
    }

    public long getTotalWorkMinutes() {
        return totalWorkMinutes;
    }

    public ArrayList<Work> getWork() {
        return works;
    }

    public String[] getDifferentWorkTitles() {
        String[] result = new String[0];

        return result;
    }
}
