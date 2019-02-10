public class Vector{
    double[] coords = new double[3];
    double x,y,z = 0;
    double magnitude = 0;
    public Vector(double x,double y){
	coords[0] = x;
	coords[1] = y;
    }
    public Vector(double x,double y,double z){
	coords[0] = x;
	coords[1] = y;
	coords[2] = z;
	
    }
    public Vector(double[] coords){
	this.coords = coords;
    }
    private void updateMagnitude(){
	double sum = 0;
	for(double i: coords){
	    sum += i*i;
	}
	magnitude = Math.sqrt(sum); 
    }
    private void refreshPoints(){
	x = coords[0];
	y = coords[1];
	;
    }
    public Vector UP(){
	return new Vector(0,1,0);
    }
}
