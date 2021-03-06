public class MyLab{
    public static void main(String[] args){
	System.out.println(trim("  "));
	System.out.println(capitalize("sTuY"));
	System.out.println(acronym(" *Sbfd *tdsbb uertvzb y*(^!"));
	System.out.println(scrableScore("FARM"));
	MyLab obj = new MyLab();
	System.out.println(obj.removeCharacters("counterrevolutionaries","aeiou"));
    }
    public static String trim(String str){
	int i = 0;
	int j = str.length();
	if(str.length() == 0) return str;
	while(i < j && Character.isWhitespace(str.charAt(i))){
	    i++;
	}
	while(j > i &&  Character.isWhitespace(str.charAt(i))){
	    j--;
	}
	return str.substring(i,j);
    }
    public static String capitalize(String str){
	String res = str.toLowerCase();
	if(str.length() == 0) return str;
	return (Character.isLetter(res.charAt(0)))? Character.toUpperCase(res.charAt(0)) + res.substring(1): res;
    }
    public static int scrableScore(String input){
	int res = 0;
	String[] scores = {"AEIOURSTL","DG","BCMP","FHVWY","K","JX","QZ"};
	for(int i = 0; i < input.length(); i++){
	    if(Character.isUpperCase(input.charAt(i))){
		for(int p = 0; p < scores.length;p++){
		    if(scores[p].contains(input.substring(i,i+1))){
			res += p+1;
		    }
		}
	    }
	}
	return res;
    }
    public static String acronym(String input){
	String res = "";
	for(int i = 0; i < input.length(); i++){
	    if(i == 0){
		if( Character.isLetter(input.charAt(i))){
		    res += input.substring(i,i+1);
		    i++;
		}
	    }else{
		if( !Character.isLetter(input.charAt(i-1))&& Character.isLetter(input.charAt(i)) ){
		    res += input.substring(i,i+1);
		    i++;
		}
	    }
	}
	return res;
    }
    private String removeCharacters(String str,String remove){
	String res = str;
	for(int i = 0; i<remove.length();i++){
	    res = res.replace(remove.substring(i,i+1),"");
	}
	return res;
    }
}
