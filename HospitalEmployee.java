public class HospitalEmployee {
    protected String name;
    protected int number;

    public HospitalEmployee(){
        name = "";
        number = 0;
    }
    public HospitalEmployee(String firstname, int num){
        name = firstname;
        number = num;
    }

    public void work() {
        System.out.println (name + " works for the hospital."); }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "\t" + number;
    }
}
