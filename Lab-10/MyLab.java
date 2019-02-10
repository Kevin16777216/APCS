public class MyLab{
    public static void main(String[] args){
	System.out.println(gcd(6,9));
	System.out.println(digitSum(12345));
	System.out.println(digitalRoot(1729));
    }
    public static int gcd(int x, int y){
	return (y == 0)? x : gcd(y,x%y);
    }
    public static int digitSum(int n){
	return (n < 10)? n : (digitSum(n/10) + n%10);
    }
    public static int digitalRoot(int n){
	return (n < 10)? n: digitalRoot(digitSum(n));
    }
}
