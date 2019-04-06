import java.time.*;
public class _3bTestFitnessTracker2
{
    public static void main(String[] args)
    {
        _3bFitnessTracker2 exercise1 = new _3bFitnessTracker2();

        System.out.println(exercise1.getFitnessActivity() + " " + exercise1.getMinutes() +
                " minutes on " + exercise1.getDate());


        LocalDate date = LocalDate.of(2019, 3, 28);

        _3bFitnessTracker2 exercise2 = new _3bFitnessTracker2("bicycling", 35, date);

        System.out.println(exercise2.getFitnessActivity() + " " + exercise2.getMinutes() +
                " minutes on " + exercise2.getDate());
    }
}