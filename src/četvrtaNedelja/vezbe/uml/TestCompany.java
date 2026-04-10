package četvrtaNedelja.vezbe.uml;

import java.util.Date;

public class TestCompany {
    public static void main(String[] args){
        Company company = new Company("LukTech");

        Manager m = new Manager("Marko",1,5000);

        Employee e1 = new Employee("Jovan",2,4000);
        Employee e2 = new Employee("Nikola",3,4500);

        Contractor c = new Contractor("Pera",4,7000,new Date());

        //Sklapamo:

        m.addTeamMember(e1);
        m.addTeamMember(e2);

        company.addEmployeeInList(e1);
        company.addEmployeeInList(e2);
        company.addEmployeeInList(m);
        company.addEmployeeInList(c);

        System.out.println(company);

        for (Employee e : company.getEmployees()){
            System.out.println(e);
        }

        for (Employee e : m.getManages()){
            System.out.println(e.getName());
        }

    }
}
