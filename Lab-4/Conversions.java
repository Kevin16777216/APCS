public class Conversions{
    public static void main(String[] args){
	System.out.println("Your temperature:" + args[0] + " Degrees C");
	Double res = Double.parseDouble(args[0]);
	res = (9.0/5)*res + 32;

	System.out.println("Farenheit:" + res + " Degrees C");
	
    }
}
