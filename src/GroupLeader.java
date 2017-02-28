/**
 * Created by razvan on 27.02.2017.
 */
public class GroupLeader extends Employee implements java.io.Serializable{
    public GroupLeader(String name, String email) {
        super(name,email);
        this.employeeType="GroupLeader";
    }
}
