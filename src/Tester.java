/**
 * Created by razvan on 27.02.2017.
 */
public class Tester extends Employee implements java.io.Serializable{

    public Tester(String name, String email, boolean manualTesting, boolean automaticTesting) {
        super(name,email);
        this.args=new Boolean[2];
        this.args[0] = manualTesting;
        this.args[1] = automaticTesting;
        this.employeeType="Tester";
    }
}
