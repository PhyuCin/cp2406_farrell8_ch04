public class Patient {
    int id;
    int age;
    BloodData bloodData;

    public Patient(){
        id = 0;
        age = 0;
        bloodData = new BloodData();
    }

    public Patient(int id , int age, String blood, String rhFactor){
        this.id = id;
        this.age = age;
        bloodData = new BloodData(blood, rhFactor);
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
