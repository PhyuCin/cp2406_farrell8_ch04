import java.time.*;
public class TestFitnessTracker {

    public static void main(String[] args)
    {
        FitnessTracker exercise1 = new FitnessTracker();

        System.out.println(exercise1.getFitnessActivity() + " " + exercise1.getMinutes() +
                " minutes on " + exercise1.getDate());


        LocalDate date = LocalDate.of(2019, 3, 28);

        FitnessTracker exercise2 = new FitnessTracker("Swimming", 20, date);

        System.out.println(exercise2.getFitnessActivity() + " " + exercise2.getMinutes() +
                " minutes on " + exercise2.getDate());
    }
}