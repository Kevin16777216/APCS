
public class Kary{

    public static void main(String[] args){
	int n = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int power = 1;
	String nums = "0123456789ABCDEF";
	while (power <= n / b) power *= b;
	while (power > 0){
	    int weight = 0;
	    if (n >= power){
		weight = n/power;
		n -= weight*power;
	    }
	    System.out.print(nums.charAt(weight));
	    power /= b;
	}
    }
}
