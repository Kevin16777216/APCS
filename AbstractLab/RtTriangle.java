public class RtTriangle extends Shape{
    private int width,height;
    public RtTriangle(int w, int h){
	super(3);
	width = w;
	height = h;
    }
    @Override
    public int getArea(){
	return width*height/2;
    }
    @Override
    public int getPerimeter(){
	return (int) Math.sqrt(width*width+height*height)+width+height;
    }
}
