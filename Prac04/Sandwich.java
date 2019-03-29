public class Sandwich {
    public Bread bread;
    public SandwichFilling filling;

    public Sandwich(String bread, int breadCalories, String filling, int fillingCalories){
        this.bread = new Bread(bread, breadCalories);
        this.filling = new SandwichFilling(filling, fillingCalories);
    }

    public Bread getBread() {
        return bread;
    }

    public SandwichFilling getFilling() {
        return filling;
    }
}
