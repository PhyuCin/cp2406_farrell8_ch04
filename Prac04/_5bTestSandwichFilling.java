public interface _5bTestSandwichFilling {
    public static void main(String[] args){
        _5bSandwichFilling eggSalad = new _5bSandwichFilling("Egg Salad", 20);
        _5bSandwichFilling peanutButter = new _5bSandwichFilling("Peanut Butter", 15);
        _5bSandwichFilling kaya = new _5bSandwichFilling("Kaya", 13);

        System.out.println("Type: " + eggSalad.getFillingType() + ", Calories in a serving: " +
                eggSalad.getCaloriesInAServing());

        System.out.println("Type: " + peanutButter.getFillingType() + ", Calories in a serving: " +
                peanutButter.getCaloriesInAServing());

        System.out.println("Type: " + kaya.getFillingType() + ", Calories in a serving: " +
                kaya.getCaloriesInAServing());

    }
}
