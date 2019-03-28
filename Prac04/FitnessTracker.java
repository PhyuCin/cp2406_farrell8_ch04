import java.time.*;

public class FitnessTracker {
        String fitnessActivity;
        int minutes;
        LocalDate date;

        public FitnessTracker(){
            fitnessActivity = "Running";
            minutes = 0;
            date = LocalDate.of(2019, 1, 1);
        }
    public FitnessTracker(String a, int m, LocalDate d)
    {
        fitnessActivity = a;
        minutes = m;
        date = d;
    }
    public String getFitnessActivity()
    {
        return fitnessActivity;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public LocalDate getDate()
    {
        return date;
    }
}

