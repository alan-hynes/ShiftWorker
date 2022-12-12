package ie.atu.exam;

public class ShiftWorker {
    private String name;
    private String gender;
    private int shift;
    private int age;
    boolean female;
    boolean male;
    boolean nonbinary;

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
    public void setAge(int age) {
        this.age = age;
    }

    public ShiftWorker(String name){
        if( name < 6){
            System.out.println("Invalid Input. Minimum of 6 characters");
        }
        else if( name > 21){
            System.out.println("Invalid Input. Maximum of 6 characters");
        }
        else{
            System.out.println(name);
        }
    }

    public ShiftWorker(String gender){
        boolean f = female;
        boolean m = male;
        boolean n = nonbinary;

        if (gender = f)
        {
            System.out.print("Female");
        }

        else if (gender = m)
        {
            System.out.print("Male");
        }

        else if (gender = n)
        {
            System.out.print("Non-Binary");
        }

        else{
            System.out.print("Invalid Gender Type");
        }
    }

    public void setGender(boolean gender)
    {
        if (gender = f)
        {
            System.out.print("Female");
        }

        else if (gender = m)
        {
            System.out.print("Male");
        }

        else if (gender = n)
        {
            System.out.print("Non-Binary");
        }

        else{
            System.out.print("Invalid Gender Type");
        }
    }

    public boolean isGender() {
        return gender;
    }

    public ShiftWorker(int age){
        if( age < 18){
            System.out.println("Age must be at least 18");
        }
        else{
            System.out.println(age);
        }
    }

    public ShiftWorker(int shift){
        System.out.println("Select 1 for Day shift or select 2 for  Night Shift");
        if (shift = 1){
            System.out.print("Day shift");
        }
        if else(shift = 2){
            System.out.print("Night shift");
        }
        else{
            System.out.println("Invalid Input")
        }
    }
}
