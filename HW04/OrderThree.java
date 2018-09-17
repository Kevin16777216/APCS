import java.util.Scanner;
public class OrderThree{
    public static void main(String[] args){
	new OrderThree().run();
    }
    public void run(){
	Scanner sc = new Scanner(System.in);
	int a,b,c,x,y,z;
	System.out.print("enter an integer:");
	a = sc.nextInt();
	System.out.print("enter an integer:");
	b = sc.nextInt();
	System.out.print("enter an integer:");
	c = sc.nextInt();
	z = Math.max(a,Math.max(b,c));
	x = Math.min(a,Math.min(b,c));
	y = a + b + c - x - z;

	System.out.println("Ascending order:"+ x+","+y +", and "+z);
	
    }
}
