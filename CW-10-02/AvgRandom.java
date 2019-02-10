public class AvgRandom{
    public static void main(String[] args){
	double res = 0;
	int input = Integer.parseInt(args[0]);
	for(int i = 1; i <= input; i++){
	    double cr = Math.random();
	    System.out.println("term" + i + "   "+ cr);
	    res += cr;
        }
	res /= input;
	System.out.println("mean :" + res);
    }
}
