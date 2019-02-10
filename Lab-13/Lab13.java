public class Lab13{
    public static void main(String[] args){
	System.out.println(reverse("racecar"));
	System.out.println(reverse(" card"));
	System.out.println(reverse("     \n \n    "));
	System.out.println(reverseR("racecar"));
	System.out.println(reverseR(" card"));
	System.out.println(reverseR("     \n \n    "));
	System.out.println(scramble("racecar"));
	
    }
    public static String reverse(String str){
	String res = "";
	for(int i = str.length()-1; i >= 0;i--){
	    res += str.charAt(i);
	}
	return res;
    }
    public static String reverseR(String str){
	return (1 >= str.length()) ? str : reverseR(str.substring(1))+ str.charAt(0); 
    }
    public static String scramble(String str){
	char[] k = str.toCharArray();
	for(int i = 0; i<str.length();i++){
	    int p = (int) (Math.random() * k.length);
	    char temp = k[i];
	    k[i] = k[p];
	    k[p] = temp;
	}
	return new String(k);
    }
}
