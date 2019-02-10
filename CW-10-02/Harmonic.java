public class Harmonic{
    public static void main(String[] args){
	double res = 0;
	int input = Integer.parseInt(args[0]);
	for(int i = 1; i <=input; res += 1.0/i++){}
	System.out.println("sum :" + res);
	System.out.println("approx :" + (Math.log(input)+0.57721));
    }
}
