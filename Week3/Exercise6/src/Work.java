import java.time.LocalDate;

public class Work {
    private String task;
    private LocalDate startDate;
    private LocalDate endDate;
    private long minutes;

    public String getTask() {
        return task;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public long getMinutes() {
        return minutes;
    }
}
