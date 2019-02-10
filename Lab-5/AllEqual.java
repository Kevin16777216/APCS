import java.util.Scanner;
public class AllEqual {
    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);
	System.out.print("Input a: ");
	double a = sc.nextDouble();
	System.out.print("Input b: ");
	double b = sc.nextDouble();
	System.out.print("Input c: ");
	double c = sc.nextDouble();
	System.out.println("The three numbers you input "+((a == b&& b == c)?"are":"aren't")+" equal");
    }
}
