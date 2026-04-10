package četvrtaNedelja.vezbe.uml;

import java.util.Date;

public class Contractor extends Employee {
    private Date lengthOfContract;

    public Contractor(String name,int employeeNumber,int salary, Date lengthOfContract){
        super(name,employeeNumber,salary);
        this.lengthOfContract = lengthOfContract;
    }

    public Date getLengthOfContract() {
        return lengthOfContract;
    }

    public void setLengthOfContract(Date lengthOfContract) {
        this.lengthOfContract = lengthOfContract;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
