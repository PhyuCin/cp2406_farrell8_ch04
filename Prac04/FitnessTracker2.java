import java.time.*;

public class FitnessTracker2 {
    String fitnessActivity;
    int minutes;
    LocalDate date;

    public FitnessTracker2(){
        this("Swimming", 30, LocalDate.of(2019, 3, 28));
    }

    // exercise 3a

    public FitnessTracker2(String a, int m, LocalDate d)
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

