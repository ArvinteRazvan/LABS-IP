import java.util.ArrayList;

/**
 * Created by razvan on 27.02.2017.
 */
public class TeamLeader extends Employee implements java.io.Serializable{
    public TeamLeader(String name, String email) {
        super(name,email);
        this.employeeType="TeamLeader";
    }
}
