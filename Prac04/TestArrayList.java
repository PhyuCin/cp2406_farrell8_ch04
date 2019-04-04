import java.util.ArrayList;

public class TestArrayList {
    private static ArrayList<Double> history = new ArrayList<>();
    private static double calculatedValue = 0;

    public static void main(String[] args){
        history.add(calculatedValue);

        System.out.println(history.get(history.size()-1));

        calculatedValue = calculatedValue + 5;
        history.add(calculatedValue);
        System.out.println(history.get(history.size()-1));

        history.remove(history.size()-1);
        System.out.println(history.get(history.size()-1));
    }

}
