public abstract class Shape{
    int numSides;
    public Shape(int numSides){
	this.numSides = numSides;
    }
    public int getSides(){
	return numSides;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
