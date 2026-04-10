package četvrtaNedelja.vezbe.uml;

import java.util.ArrayList;

public class Manager extends Employee {

    public ArrayList<Employee> manages;

    public Manager(String name,int employeeNumber,int salary){
        super(name,employeeNumber,salary);
        this.manages = new ArrayList<>();
    }

    public void addTeamMember(Employee e){
        manages.add(e);
        e.setManager(this);//this referenca na trenutni objekat
    }

    public ArrayList<Employee> getManages() {
        return manages;
    }

    public void setManages(ArrayList<Employee> manages) {
        this.manages = manages;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
