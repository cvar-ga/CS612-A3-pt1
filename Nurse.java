public class Nurse extends HospitalEmployee{
    protected int numOfPatients;

    public Nurse(String firstname, int num, int numOfPatients) {
        super(firstname, num);
        this.numOfPatients = numOfPatients;
    }

    @Override
    public String toString() {
        return name + "\t" + number + "\thas " + numOfPatients + " patients.";
    }

    @Override
    public void work() {
        super.work();
        System.out.println (name + " is a nurse with " + numOfPatients + " patients.");
    }
}
