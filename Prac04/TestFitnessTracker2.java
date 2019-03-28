import java.time.*;
public class TestFitnessTracker2
{
    public static void main(String[] args)
    {
        FitnessTracker2 exercise1 = new FitnessTracker2();

        System.out.println(exercise1.getFitnessActivity() + " " + exercise1.getMinutes() +
                " minutes on " + exercise1.getDate());


        LocalDate date = LocalDate.of(2019, 3, 28);

        FitnessTracker2 exercise2 = new FitnessTracker2("bicycling", 35, date);

        System.out.println(exercise2.getFitnessActivity() + " " + exercise2.getMinutes() +
                " minutes on " + exercise2.getDate());
    }
}