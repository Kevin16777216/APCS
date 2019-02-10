public class MyLab{
    public static void main(String[] args){
	System.out.println(Cannonball(3));
	String[] Planets = {"Mercury","Venus","Earth","Mars","?","Jupiter","Saturn","Uranus","Neptune"};
	for(int i = 1;i < Planets.length;i++){
	    System.out.println(Planets[i-1]+ "\t"+getTitiusBodeDistance(i) +"AU");
	}
    }
    public static int Cannonball(int height){
        return (height == 1)? 1 :height*height + Cannonball(height-1);
    }
    public static double getTitiusBodeDistance(int k){
	return (4 + distanceHelper(k))/10;
    }
    public static double distanceHelper(int k){
	if(k == 1) return 1;
	return (k == 2)? 3: 2 * distanceHelper(k-1);
    }
    
    
}
