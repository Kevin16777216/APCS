import java.util.Scanner;
public class Seasons{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String season = "Winter";
	System.out.print("Give me a month");
	switch(sc.next()){
	case "March":
	case "April":
	case "May":
	    season = "Spring";
	    break;
	case "June":
	case "July":
	case "August":
	    season = "Summer";
	    break;
	case "September":
	case "October":
	case "November":
	    season = "Fall";
	    break;
	default:
	}
	System.out.println(season);
    }
}
