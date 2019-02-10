import java.util.ArrayList;
public class PointClient{

    public static void main(String [] args){
	new PointClient().run();

    }


    public void run(){
	// Testing the constructors
	Point p1 = new Point();     // the default constructor
	Point p2 = new Point(2,5);  // another constructor
       
	// testing the toString methods
	// An explicit call p1.toString() is unnecessary
	System.out.println("Testing toString ");
	System.out.println("p1 : " + p1); 
	System.out.println("p2 : " + p2);

	// testing getX() and getY() methods
	System.out.println("Testing getX() and getY()" );
	System.out.println(p1 + " p1.getX() " + p1.getX());
	System.out.println(p1 + " p1.getY() " + p1.getY());
	System.out.println(p2 + " p2.getX() " + p2.getX());
	System.out.println(p2 + " p2.getY() " + p2.getY());

	// Test the Constructor Point(Point other)
	Point p3 = new Point(p2);
	System.out.println("Test another constructor ");
	System.out.println("p2: " + p2 + " p3 a copy of p2 : " + p3);

	// Test the method getLocation
	System.out.println("Testing getLocation ");
	System.out.println(p3 + " get location " + p3.getLocation());
	ArrayList<Point> test = randomPoints(9,-3,3);
	System.out.print(test(randomPoints(9,-3,3));

    }
    public static void translate(ArrayList<Point> coolList){
	for(int i = 0; i < coolList.size() ;i++){
	    coolList.get(i).translate(1,-1);
	}
    }
    public static ArrayList<Point> randomPoints(int n, int from, int to){
	ArrayList<Point> k = new ArrayList<Point>();
	double diff = to - from + 1;
	for(int i=0; i< n; i++){
	    int o = (int)(from -1+ (Math.random() * diff));
	    int j = (int)(from -1+ (Math.random() * diff));
	    k.add(new Point(o,j));
	}
	return k;
    }

}
