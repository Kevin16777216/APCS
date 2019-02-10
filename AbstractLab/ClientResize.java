public class ClientResize{
    public static void main(String[] args){
	Rectangle myRect = new Rectangle(2,3);
	System.out.println("Perimeter:"+myRect.getPerimeter()+ " Area:" + myRect.getArea());
        myRect.resize(2);
	System.out.println("Perimeter:"+myRect.getPerimeter()+ " Area:" + myRect.getArea());
    }
}
