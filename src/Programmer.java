/**
 * Created by razvan on 27.02.2017.
 */
public class Programmer extends Employee implements java.io.Serializable {

    public Programmer(String name,String email,String[] programmingLanguages){
        super(name,email);
        this.args=programmingLanguages;
        this.employeeType="Programmer";
    }
}
