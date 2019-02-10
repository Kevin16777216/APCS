public class Athlete implements Trainable{
    private String firstName;
    private String lastName;
    private double hoursTrained = 0;
    public Athlete(String first, String last){
	firstName = first;
	lastName = last;
    }
    public double getHoursTrained(){
	return hoursTrained;
    }
    public void train(double hours){
	hoursTrained += hours;
    }
    @Override
    public String toString(){
	return firstName + " " + lastName + " "+hoursTrained +"hours Trained";
    }
}
