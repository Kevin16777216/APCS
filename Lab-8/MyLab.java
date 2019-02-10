public class MyLab{
    public static void main(String[] args){
	System.out.println(getPI());
	System.out.println("Math.PI : " +Math.PI);
        System.out.println("e^2 :  "+exp(2));
	System.out.println("Math.E ^2 :  "+Math.pow(Math.E,2));
	System.out.println("P(52,2) :   "+permutations(52,2)); 
    }
    public static double getPI(){
	for(double i = 3, current = 0.5,res = 0.5; true ; i+=2){
	    double add =  current*Math.pow(0.5,i)*(1/i);
	    res +=  add;
	    if(add == 0) return res * 6;
	    current *= i/(i+1);
	}
    }
    public static double exp(int x){
	if(x == 0) return 1;
	for(double i = 0,res = 0;true;i++){
	    double prev = res;
	    res+= helperExp(x,i);
	    if(prev == res)return res;
	}
    }
    public static double helperExp(double x,double i){
	double res = 1;
	for(double j = 1;j <= i;j++){
	    res *= (1/j) *x;
	}
	return res;
    }
    public static int permutations(int n,int k){
	if(k == 0) return 1;
	for(int i = 0,res = 1;true;i++){
	    res *= (n-i);
	    if(i == k-1) return res;
	}
    }
    
    }
