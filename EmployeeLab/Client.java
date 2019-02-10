public class Client{
    public static void main(String[] args){
	HourlyEmployee bob = new HourlyEmployee("Bob",12.35);
	System.out.println(bob);
	bob.setHoursWorked(5.5);
	System.out.println("After 5.5 hours: "+ bob + " pay:  "+bob.getPay());
    }
}
