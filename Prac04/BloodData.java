public class BloodData {
    String blood;
    String rhFactor;

    public BloodData(){
        blood = "O";
        rhFactor = "+";
    }

    public BloodData(String blood, String rhFactor)
    {
        this.blood = blood;
        this.rhFactor = rhFactor;
    }

    public void setBlood(String b){
        blood = b;
    }

    public void setrhFactor(String rh){
        blood = rh;
    }

    public String getBlood(){
        return blood;
    }

    public String getRhFactor(){
        return rhFactor;
    }

}
