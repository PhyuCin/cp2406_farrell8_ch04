public class TestBread {
    public static void main(String[] arg){
        Bread rye = new Bread("Rye", 100);
        Bread wholemeal = new Bread("Wholemeal", 50);
        Bread white = new Bread("White", 80);

        System.out.println("Our motto is " + Bread.MOTTO);
        System.out.println("Type: " + rye.getBreadType() + ", Calories: " +
                rye.getCaloriesPerSlice());
        System.out.println("Type: " + wholemeal.getBreadType() + ", Calories: " +
                wholemeal.getCaloriesPerSlice());
        System.out.println("Type: " + white.getBreadType() + ", Calories: " +
                white.getCaloriesPerSlice());

    }

}
