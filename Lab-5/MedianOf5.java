import java.util.Scanner;
public class MedianOf5 {
    public static void main(String[] Strings) {
	double[] res = new double[5];
        Scanner sc = new Scanner(System.in);
	for(int i = 0; i< 5; i++){
	    System.out.print("Input a number: ");
	    res[i] = sc.nextDouble();
	}
	int compare = 0;
	for(int i = 1; i < 5;i++){
	    int j = i;
	    while(j > 0 && res[j-1] > res[j]){
		swap(res,j,j-1);
		compare++;
		j--;
	    }
	}
	System.out.println(res[2] +"|"+ compare);
        
    }
    
    public static void swap(double[] res,int a, int b){
	double tmp = res[b];
	res[b] = res[a];
	res[a] = tmp;
    }
    
}
