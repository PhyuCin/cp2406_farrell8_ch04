public class _4bPatient {
    int id;
    int age;
    _4aBloodData bloodData;

    public _4bPatient(){
        id = 0;
        age = 0;
        bloodData = new _4aBloodData();
    }

    public _4bPatient(int id , int age, String blood, String rhFactor){
        this.id = id;
        this.age = age;
        bloodData = new _4aBloodData(blood, rhFactor);
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAge(int age){
        this.age = age;
    }

}
