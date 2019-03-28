public class TestPatient {

    public static void main(String[] args){
        Patient harry = new Patient();
        System.out.println(harry.getId() +" - Age " + harry.getAge() + " - Blood Type " + harry.bloodData.getBlood() +
                harry.bloodData.getRhFactor());

        Patient suzy = new Patient(1, 23, "B", "-");
        System.out.println(suzy.getId() +" - Age " + suzy.getAge() + " - Blood Type " + suzy.bloodData.getBlood() +
                suzy.bloodData.getRhFactor());

        suzy.setId(2);
        suzy.setAge(16);
        suzy.bloodData.setBlood("A");
        suzy.bloodData.setRhFactor("+");

        System.out.println(suzy.getId() +" - Age " + suzy.getAge() + " - Blood Type " + suzy.bloodData.getBlood() +
                suzy.bloodData.getRhFactor());
    }
}
