import java.io.*;
import java.util.ArrayList;

/**
 * Created by razvan on 28.02.2017.
 */
public class EmployeeFactory {
    public Employee getEmployee(String fileName)
    {
        Employee e=null;
        try{
            FileInputStream fileIn=new FileInputStream(fileName);
            ObjectInputStream in=new ObjectInputStream(fileIn);
            e=(Employee) in.readObject();
            in.close();
            fileIn.close();
            return e;
        }
        catch (IOException exeption){
            exeption.printStackTrace();
            return null;
        }catch (ClassNotFoundException exeption){
            exeption.printStackTrace();
            return null;
        }
    }
    public void setEmployee(String fileName,Employee e)
    {
        try{
            FileOutputStream fileOut=new FileOutputStream(fileName);
            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        }catch (IOException exeption){
            exeption.printStackTrace();
            return;
        }
    }

    /*public ArrayList<Employee> getEmployees(String[] args,ArrayList<Employee> currentList){
        int j=0;
        if (args[j]=="}")
            return currentList;
        switch (args[j])
        {
            case "Programmer":
            {
                String[] languages=new String[100];
                String name=args[j+1];
                String email=args[j+2];
                j=j+2;
                int i=0;
                while(args[i+j] != "|")
                {
                    languages[i]=args[i+j];
                    i++;
                }
                Programmer programmer=new Programmer(name,email,languages);
                currentList.add(programmer);
                return getEmployees(args[i+j],currentList);

                break;
            }

        }
    }
    */

}
