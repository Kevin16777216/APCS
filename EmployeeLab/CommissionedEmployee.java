public class CommissionedEmployee extends Employee implements Payable{
    private double baseSalary,commissionRate,salesVolume;
    public CommissionedEmployee(String name, double base, double rate, double volume){
	super(name);
	baseSalary = base;
	commissionRate = rate;
	salesVolume  = volume;
    }
    public void setBaseSalary(double base){
	baseSalary = base;
    }
    @Override
    public double payCheck(){
	return getPay() * 24;
    }
    @Override
    public double getPay(){
	return baseSalary + commissionRate + salesVolume;
    }
    public double getBaseSalary(){
	return baseSalary;
    }
    @Override
    public String toString(){
	return super.toString() + "In base Salary: "+baseSalary;
    }
    
}
