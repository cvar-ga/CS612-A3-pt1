public class Surgeon extends Doctor{
    protected boolean operating;

    public Surgeon(String firstname, int num, String specialty, boolean operating) {
        super(firstname, num, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        return name + "\t" + number + "\t" + specialty + "\tOperating: " + operating;
    }

    @Override
    public void work() {
        super.work();
        String isOperating = " is operating now.";
        if(!operating) isOperating = " is not operating now.";
        System.out.println (name + isOperating);
    }
}
