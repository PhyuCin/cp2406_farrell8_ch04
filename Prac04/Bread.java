public class Bread {
    public String breadType;
    public int caloriesPerSlice;
    public final static String MOTTO = "The staff of life";

    public Bread(String breadType, int caloriesPerSlice){
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;

    }

    public String getBreadType() {
        return breadType;
    }

    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }


}
