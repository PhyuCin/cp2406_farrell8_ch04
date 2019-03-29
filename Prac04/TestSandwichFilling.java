public interface TestSandwichFilling {
    public static void main(String[] args){
        SandwichFilling eggSalad = new SandwichFilling("Egg Salad", 20);
        SandwichFilling peanutButter = new SandwichFilling("Peanut Butter", 15);
        SandwichFilling kaya = new SandwichFilling("Kaya", 13);

        System.out.println("Type: " + eggSalad.getFillingType() + ", Calories in a serving: " +
                eggSalad.getCaloriesInAServing());

        System.out.println("Type: " + peanutButter.getFillingType() + ", Calories in a serving: " +
                peanutButter.getCaloriesInAServing());

        System.out.println("Type: " + kaya.getFillingType() + ", Calories in a serving: " +
                kaya.getCaloriesInAServing());

    }
}
