public class _5cSandwich {
    public _5aBread a5aBread;
    public _5bSandwichFilling filling;

    public _5cSandwich(String bread, int breadCalories, String filling, int fillingCalories){
        this.a5aBread = new _5aBread(bread, breadCalories);
        this.filling = new _5bSandwichFilling(filling, fillingCalories);
    }

    public _5aBread getA5aBread() {
        return a5aBread;
    }

    public _5bSandwichFilling getFilling() {
        return filling;
    }
}
