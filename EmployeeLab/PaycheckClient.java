import java.util.ArrayList;
import java.util.List;
public class PaycheckClient{
    public static void Main(String[] args){
	List<Employee> Employees = new ArrayList<Employee>();
	Employees.add(new CommissionedEmployee("A",30,2,10));
        Employees.add(new SalaryEmployee("B",15));
	Employees.add(new HourlyEmployee("C",-10.0,9.0));
	for(Employee i: Employees){
	    System.out.println(i);
	    System.out.println("Paycheck:" +i.payCheck());
	}
    }
}
