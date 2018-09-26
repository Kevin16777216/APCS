import java.util.Scanner;
public class QuadraticSolver {
    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);
	double a = 0;
	while(a == 0){
	    System.out.print("Input a: ");
	    a = sc.nextDouble();
	    if(a == 0){
		System.out.println("Please choose a nonzero number");
	    }
	}
	System.out.print("Input b: ");
	double b = sc.nextDouble();
	System.out.print("Input c: ");
	double c = sc.nextDouble();
	double res = b * b - 4.0 * a * c;
	if (res > 0.0) {
	    double r1 = (-b + Math.sqrt(res)) / (2.0 * a);
	    double r2 = (-b - Math.sqrt(res)) / (2.0 * a);
	    System.out.println("Roots: " + r1 + "," + r2);
	} else if (res == 0.0) {
	    double r1 = -b / (2.0 * a);
	    System.out.println("Root: " + r1);
	} else {
	    System.out.println("No real roots.");
	}

    }
}
