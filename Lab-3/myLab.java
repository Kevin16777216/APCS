import java.util.Scanner;
public class MyLab{
    public static void main(String[] args){
	//Part 1
	System.out.println(1.0 / 0.0);
	System.out.println(Math.sqrt(-1.0));
	System.out.println(1.03 - 0.42);
	//returns Infinity because of rounding errors
	//returns NaN because the value is not real
	//returns 0.6100000000000001 due to rounding errors
	boolean a = true;
	boolean b = false;
	System.out.println((! (a && b) && (a || b)) || ((a && b) || !(a || b)));
	/*Explanation
	  if a is true and b is false:
	  ((! (T && F) && (T || F)) || ((T && F) || !(T || F))
	  ((! F && T) || ( F || !T))
	  (T || ( F))-> T
	  This would yield the same resullt if a is false and b
          is true due to the ! (T && F)&& (T || F)   on the left, which would always be true if one of a or b is false.
	  if a  and b are false:
	  (... || ((F && F) || !(F || F))-> !(F || F) would be true, so the entire expression would be true due to the
          two OR statements.
	  if a and b are true:
	  (... || ((F && F) || !(F || F))-> (F && F) would be true, so the entire expression would be true due to the
          two OR statements.
	*/
	new MyLab().run();
    }
    public void run(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Give me a number:");
	String res = sc.nextLine();
	double x = Double.parseDouble(res);
	System.out.println(Math.sin(2*x)+Math.sin(3*x));
    }


}
