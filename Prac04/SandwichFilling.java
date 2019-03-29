public class SandwichFilling {
    public String fillingType;
    public int caloriesInAServing;

    public SandwichFilling(String fillingType, int caloriesInAServing){
        this.fillingType = fillingType;
        this.caloriesInAServing = caloriesInAServing;
    }

    public String getFillingType() {
        return fillingType;
    }

    public int getCaloriesInAServing() {
        return caloriesInAServing;
    }

}
