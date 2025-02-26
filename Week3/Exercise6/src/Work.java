import java.time.LocalDate;

public class Work {
    private String task;
    private LocalDate startDate;
    private LocalDate endDate;
    private long minutes;

    public Work(String task, LocalDate startDate, LocalDate endDate){
        this.task = task;
        this.startDate = startDate;
        this.endDate = endDate;
    }

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
