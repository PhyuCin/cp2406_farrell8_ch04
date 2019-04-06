public class _4aBloodData {
    String blood;
    String rhFactor;

    public _4aBloodData(){
        blood = "O";
        rhFactor = "+";
    }

    public _4aBloodData(String blood, String rhFactor)
    {
        this.blood = blood;
        this.rhFactor = rhFactor;
    }

    public void setBlood(String b){
        blood = b;
    }

    public void setRhFactor(String rh){
        rhFactor= rh;
    }

    public String getBlood(){
        return blood;
    }

    public String getRhFactor(){
        return rhFactor;
    }

}
