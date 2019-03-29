public class TestSandwich {
    public static void main(String[] args){
        Sandwich peanutButter = new Sandwich("White",80, "Peanut Butter", 20);
        Sandwich kaya = new Sandwich("Whole Meal",50, "Kaya", 15);
        Sandwich eggSalad = new Sandwich("Rye",100, "Egg Salad", 35);

        System.out.println("Peanut Butter Sandwich:");
        System.out.println("Bread - " + peanutButter.getBread().getBreadType() +
                ", Calories - " + peanutButter.getBread().getCaloriesPerSlice() +
                "\nFilling - " + peanutButter.getFilling().getFillingType() +
                ", Calories - " + peanutButter.getFilling().getCaloriesInAServing() +
                "\nTotal calories - " + calculateTotalCalories(peanutButter.getBread().getCaloriesPerSlice(),
                        peanutButter.getFilling().getCaloriesInAServing()));

        System.out.println("\nKaya Sandwich:");
        System.out.println("Bread - " + kaya.getBread().getBreadType() +
                ", Calories - " + kaya.getBread().getCaloriesPerSlice() +
                "\nFilling - " + kaya.getFilling().getFillingType() +
                ", Calories - " + kaya.getFilling().getCaloriesInAServing() +
                "\nTotal calories - " + calculateTotalCalories(kaya.getBread().getCaloriesPerSlice(),
                        kaya.getFilling().getCaloriesInAServing()));

        System.out.println("\nEgg Salad Sandwich:");
        System.out.println("Bread - " + eggSalad.getBread().getBreadType() +
                ", Calories - " + eggSalad.getBread().getCaloriesPerSlice() +
                "\nFilling - " + eggSalad.getFilling().getFillingType() +
                ", Calories - " + eggSalad.getFilling().getCaloriesInAServing() +
                "\nTotal calories - " + calculateTotalCalories(eggSalad.getBread().getCaloriesPerSlice(),
                eggSalad.getFilling().getCaloriesInAServing()));

    }

    public static int calculateTotalCalories(int breadCalories, int fillingCalories){
        return breadCalories * 2 + fillingCalories;
    }
}
