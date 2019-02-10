public class Lab14{
    public static void main(String[] args){
	System.out.println(Oboenglobish("english"));
	System.out.println(Oboenglobish("hobnob"));
	System.out.println(Oboenglobish("gooiest"));
	System.out.println(Oboenglobish("amaze"));
	System.out.println(Oboenglobish("rot"));
	System.out.println(Oboenglobish(""));
    }
    public static String Oboenglobish(String str){//bad code but it works
	String res = "";
	String vowels = "aeiou";
	for(int i = 0; i < str.length(); i++){
	    char cur = str.charAt(i);
	    if(vowels.contains(cur + "")){
		if(i != 0){
		    if(!vowels.contains(str.charAt(i-1) + "" )){
			    if(i == str.length() - 1 && cur == 'e'){
				res += cur;
			        break;
			    }
			res += "ob";
		    }
		}else{
		    res += "ob";
		}
	    }
	    res += cur;
	}
	return res;	
    }
}
