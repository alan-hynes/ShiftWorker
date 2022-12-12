package ie.atu.exam;

public class ShiftWorkerApp {
    public static void main(String[] args) {
        ShiftWorker Alan = new ShiftWorker ("Alan", "m", "1", "22");
        System.out.println(Alan.toString());
        ShiftWorker Joe = new ShiftWorker ("Joe", "n", "2", "23");
        System.out.println(Joe.toString());

        ShiftWorker Emily = new ShiftWorker();
        Emily.setName("Emily");
        Emily.setGender("f");
        Emily.setShift("2");
        Emily.setAge("27");

        System.out.println("\nName: " + Emily.getName() + "\nGender: " + Emily.getGender() + "\nShift:"
                            + Emily.getShift() + "\nAge: " + Emily.getAge());

    }
}
