public class Doctor extends HospitalEmployee{
    protected String specialty;

    public Doctor(String firstname, int num, String specialty) {
        super(firstname, num);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return name + "\t" + number + "\t" + specialty;
    }

    @Override
    public void work() {
        super.work();
        System.out.println (name + " is a(n) " + specialty + " doctor.");
    }
}
