package ie.atu.exam;

public class ShiftWorker {
    private String name;
    private String gender;
    private int shift;
    private int age;

    public ShiftWorker() {
    }

    public ShiftWorker(String name, String gender, int shift, int age){
        this.name = name;
        this.gender = gender;
        this.shift = shift;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
