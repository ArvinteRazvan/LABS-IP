import java.util.ArrayList;

/**
 * Created by razvan on 27.02.2017.
 */
public abstract class Employee implements java.io.Serializable{
    public String name;
    public String email;
    public transient ArrayList<Employee> underlings;
    public transient ArrayList<Employee> bosses;
    public String employeeType;
    public Object [] args;
    public Employee(String name,String email)
    {
        this.email=email;
        this.name=name;
        this.underlings=new ArrayList<Employee>();
        this.bosses= new ArrayList<Employee>();
    }
    @Override
    public String toString()
    {
        return  ("{Job: "+this.employeeType+", Name: "+this.name+", Email: "+this.email+"}");
    }
    @Override
    public boolean equals(Object o) {
        Employee e=(Employee)o;
        if (this.name.equals(e.name) && this.email.equals(e.email))
        {
            return true;
        }
        return false;
    }

    public void setUnderlings(ArrayList<Employee> listOfUnderlings)
    {
        ArrayList<Employee> arrayUnderling;
        for (int i=0;i<listOfUnderlings.size();i++)
        {
            arrayUnderling= new ArrayList<Employee>();
            arrayUnderling.add(this);

            //listOfUnderlings.get(i).setBosses(arrayUnderling);
            this.underlings.add(listOfUnderlings.get(i));
        }
    }

    public void setBosses(ArrayList<Employee> listOfBosses)
    {
        ArrayList<Employee> arrayBosses;
        for (int i=0;i<listOfBosses.size();i++)
        {
            arrayBosses= new ArrayList<Employee>();
            arrayBosses.add(this);
            listOfBosses.get(i).setUnderlings(arrayBosses);
            this.bosses.add(listOfBosses.get(i));
        }
    }

    public ArrayList<Employee> getUnderlings() {
        return underlings;
    }

    public ArrayList<Employee> getBosses() {
        return bosses;
    }
}
