public class _4aTestBloodData {
    public static void main(String[] args){
        _4aBloodData harry = new _4aBloodData();
        System.out.println("Harry is blood type " + harry.getBlood() + harry.getRhFactor());
        _4aBloodData suzy = new _4aBloodData("AB", "-" );
        System.out.println("Suzy is blood type " + suzy.getBlood() + suzy.getRhFactor());

        suzy.setBlood("A");
        suzy.setRhFactor("+");

        System.out.println("Suzy is blood type " + suzy.getBlood() + suzy.getRhFactor());
    }
}
