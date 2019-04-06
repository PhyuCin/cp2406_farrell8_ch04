public class _5bTestSandwich {
    public static void main(String[] args){
        _5cSandwich peanutButter = new _5cSandwich("White",80, "Peanut Butter", 20);
        _5cSandwich kaya = new _5cSandwich("Whole Meal",50, "Kaya", 15);
        _5cSandwich eggSalad = new _5cSandwich("Rye",100, "Egg Salad", 35);

        System.out.println("Peanut Butter _5cSandwich:");
        System.out.println("_5aBread - " + peanutButter.getA5aBread().getBreadType() +
                ", Calories - " + peanutButter.getA5aBread().getCaloriesPerSlice() +
                "\nFilling - " + peanutButter.getFilling().getFillingType() +
                ", Calories - " + peanutButter.getFilling().getCaloriesInAServing() +
                "\nTotal calories - " + calculateTotalCalories(peanutButter.getA5aBread().getCaloriesPerSlice(),
                        peanutButter.getFilling().getCaloriesInAServing()));

        System.out.println("\nKaya _5cSandwich:");
        System.out.println("_5aBread - " + kaya.getA5aBread().getBreadType() +
                ", Calories - " + kaya.getA5aBread().getCaloriesPerSlice() +
                "\nFilling - " + kaya.getFilling().getFillingType() +
                ", Calories - " + kaya.getFilling().getCaloriesInAServing() +
                "\nTotal calories - " + calculateTotalCalories(kaya.getA5aBread().getCaloriesPerSlice(),
                        kaya.getFilling().getCaloriesInAServing()));

        System.out.println("\nEgg Salad _5cSandwich:");
        System.out.println("_5aBread - " + eggSalad.getA5aBread().getBreadType() +
                ", Calories - " + eggSalad.getA5aBread().getCaloriesPerSlice() +
                "\nFilling - " + eggSalad.getFilling().getFillingType() +
                ", Calories - " + eggSalad.getFilling().getCaloriesInAServing() +
                "\nTotal calories - " + calculateTotalCalories(eggSalad.getA5aBread().getCaloriesPerSlice(),
                eggSalad.getFilling().getCaloriesInAServing()));

    }

    public static int calculateTotalCalories(int breadCalories, int fillingCalories){
        return breadCalories * 2 + fillingCalories;
    }
}
