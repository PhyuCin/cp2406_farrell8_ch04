public class TestBloodData {
    public static void main(String[] args){
        BloodData harry = new BloodData();
        System.out.println("Harry is blood type " + harry.getBlood() + harry.getRhFactor());
        BloodData suzy = new BloodData("AB", "-" );
        System.out.println("Suzy is blood type " + suzy.getBlood() + suzy.getRhFactor());
    }
}
