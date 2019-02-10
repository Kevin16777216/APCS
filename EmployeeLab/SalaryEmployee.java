public class SalaryEmployee extends Employee implements Payable{
    double Salary = 0;
    public SalaryEmployee(String name, double Salary){
	super(name);
	this.Salary = Salary;
    }
    @Override
    public double payCheck(){
	return 24* Salary;
    }
    @Override
    public double getPay(){
	return Salary;
    }
    public void setSalary(double Salary){
	this.Salary = Salary;
    }
    @Override
    public String toString(){
	return getName() + "  Salary:" + getPay();
    }
}
