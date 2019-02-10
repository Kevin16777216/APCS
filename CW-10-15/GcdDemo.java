public class GcdDemo{
    public static void main(String[] args){
	//System.out.println(getLcm(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	System.out.println(countDigits(Integer.parseInt(args[0])));
    }
    public static int getGcd(int x,int y){
	int r = x%y;
	if (r == 0){ 
	    return y;
	}
	x = y;
	y = r;
	return getGcd(x,y);
	
    }
    public static int getLcm(int a, int b){
	return (a*b)/getGcd(a,b);
    }
    public static int countDigits(int x){
	return (int) Math.log10(Math.abs(x)) + 1;
    }
    public static double raiseToPower(int n, int k){
	return Math.pow(n,k);
    }
}
