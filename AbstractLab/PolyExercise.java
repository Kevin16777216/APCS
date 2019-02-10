import java.util.ArrayList;
public class PolyExercise{
    public static void main(String[] args){
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	Rectangle myRect = new Rectangle(2,3);
	RtTriangle myTriangle = new RtTriangle(3,4);
	shapes.add(myRect);
	shapes.add(myTriangle);
	for(Shape k:shapes){
	    if(k instanceof Resizable){
		((Resizable)k).resize(0.5);
		System.out.println("Perimeter: "+k.getPerimeter());
		System.out.println("Area: "+k.getArea());
	    }
	}
    }
}
