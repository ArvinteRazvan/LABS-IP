import java.util.ArrayList;

/**
 * Created by razvan on 28.02.2017.
 */
public class Administration {
    public static void main(String args[])
    {
        ArrayList <Employee> employeeList;

        Employee manager= new Manager("Alex","alex@yahoo.com");

        employeeList=new ArrayList<Employee>();
        employeeList.add(manager);

        Employee groupLeader=new GroupLeader("Bogdan","Bogdan@yahoo.com");
        groupLeader.setBosses(employeeList);

        employeeList.clear();
        employeeList.add(manager);
        employeeList.add(groupLeader);
        Employee teamLeader=new TeamLeader("Ciprian","ciprian@yahoo.com");
        teamLeader.setBosses(employeeList);

        employeeList.clear();
        employeeList.add(manager);
        employeeList.add(teamLeader);
        Employee programmer=new Programmer("Dan","dan@yahoo.com",new String[] {"C","C++","Java"});
        programmer.setBosses(employeeList);

        employeeList.clear();
        employeeList.add(manager);
        employeeList.add(teamLeader);
        Employee tester=new Tester("Emilia","emilia@yahoo.com",true,true);
        tester.setBosses(employeeList);
        EmployeeFactory factory=new EmployeeFactory();

        //System.out.println(programmer.name);
        //factory.setEmployee("date.out",programmer);
        //System.out.println(factory.getEmployee("date.out").name);
        for(Employee e:manager.getUnderlings())
            System.out.println(e);
    }
}
