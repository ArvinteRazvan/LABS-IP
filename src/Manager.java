import java.util.ArrayList;

/**
 * Created by razvan on 27.02.2017.
 */
public class Manager extends Employee implements java.io.Serializable{
    public Manager(String name, String email){
        super(name,email);
        this.employeeType="Manager";
    }
}
