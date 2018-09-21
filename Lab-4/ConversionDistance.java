public class ConversionDistance{
    public static void main(String[] args){
	System.out.println("Meters:" + args[0]);
	Double res = Double.parseDouble(args[0])/0.0254;
	Double feet =(res - res%12 /12);
	res -= feet;
	System.out.println("Feet:" + feet + "Inches:" + res);
    }
}
