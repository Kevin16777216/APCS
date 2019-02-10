public class HourlyEmployee extends Employee implements Payable{
    private double hourlyRate = 0;
	private double hoursWorked = 0;
    
    public HourlyEmployee(String name,double hourlyRate){
	super(name);
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double payCheck(){
	
	double out = getPay();
	hoursWorked = 0;
	return out;
    }
    @Override
    public double getPay(){
	return hourlyRate*hoursWorked;
    }
    public void setHoursWorked(double in){
	hoursWorked = in;
    }
    public void setHourlyRate(double in){
	hourlyRate = in;
    }
    @Override
    public String toString(){
	return getName() + "   hours:" +hoursWorked + "   rate:" + hourlyRate;
    }
    
}
