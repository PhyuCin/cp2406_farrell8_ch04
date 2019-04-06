import java.time.*;

public class _3aFitnessTracker {
        String fitnessActivity;
        int minutes;
        LocalDate date;

        public _3aFitnessTracker(){
            fitnessActivity = "Running";
            minutes = 0;
            date = LocalDate.of(2019, 1, 1);
        }

        // exercise 3a

    public _3aFitnessTracker(String a, int m, LocalDate d)
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

