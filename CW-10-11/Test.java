public class Test{
    public static void main(String[] args){
	int d = 7;
	System.out.println(d);
	foo(d);
	System.out.println(d);
	System.out.println(isEven(d));
	Hyp(d,d);
	System.out.println(d);
    }
    public static void foo(int j){//can't change d
	j += 2;
    }
    private static boolean isEven(int n){
	return n % 2 == 0;
    }
    private static double Hyp(double a , double b){
	return Math.sqrt(a * a + b * b);
    }
}
