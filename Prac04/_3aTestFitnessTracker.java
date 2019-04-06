import java.time.*;
public class _3aTestFitnessTracker {

    public static void main(String[] args)
    {
        _3aFitnessTracker exercise1 = new _3aFitnessTracker();

        System.out.println(exercise1.getFitnessActivity() + " " + exercise1.getMinutes() +
                " minutes on " + exercise1.getDate());

        // overload the constructor

        LocalDate date = LocalDate.of(2019, 3, 28);

        _3aFitnessTracker exercise2 = new _3aFitnessTracker("Swimming", 20, date);

        System.out.println(exercise2.getFitnessActivity() + " " + exercise2.getMinutes() +
                " minutes on " + exercise2.getDate());
    }
}