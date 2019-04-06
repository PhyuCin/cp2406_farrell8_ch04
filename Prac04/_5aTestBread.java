public class _5aTestBread {
    public static void main(String[] arg){
        _5aBread rye = new _5aBread("Rye", 100);
        _5aBread wholemeal = new _5aBread("Wholemeal", 50);
        _5aBread white = new _5aBread("White", 80);

        System.out.println("Our motto is " + _5aBread.MOTTO);
        System.out.println("Type: " + rye.getBreadType() + ", Calories: " +
                rye.getCaloriesPerSlice());
        System.out.println("Type: " + wholemeal.getBreadType() + ", Calories: " +
                wholemeal.getCaloriesPerSlice());
        System.out.println("Type: " + white.getBreadType() + ", Calories: " +
                white.getCaloriesPerSlice());

    }

}
