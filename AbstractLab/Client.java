public class Client{
    public static void main(String[] args){
	Rectangle myRect = new Rectangle(5,6);
	RtTriangle myTriangle = new RtTriangle(3,4);
	System.out.println(myRect.getPerimeter()+ ":" + myRect.getArea() +"sides:"+ myRect.getSides());
	System.out.println(myTriangle.getPerimeter()+ ":" + myTriangle.getArea()+"sides:" + myTriangle.getSides());
    }
}
