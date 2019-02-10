public class ConversionDistance{
    public static void main(String[] args){
	System.out.println("Meters:" + args[0]);
	double res =(Double.parseDouble(args[0])/0.0254);
	int feet = (int) (res/12);
	res -= feet*12;
	System.out.println("Feet:" + feet + "Inches:" + res);
    }
}
