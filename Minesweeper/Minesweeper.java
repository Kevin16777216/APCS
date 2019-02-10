public class Minesweeper{
    public static void main(String[] args){
	Table t = new Table();
    }
}
class Table{
    Boolean[][] data;
    public Table(double populated,int w,int h){
	data = new Boolean[w][h];
	for(int x = 0; x < data.length;x++){
	    for(int j = 0; j < data[x].length;j++){
		data[x][j] = (Math.random()*100 > (100-populated));
	    }
	}
    }
    public Table(Boolean[][] data){
	this.data = data;
    }
    public void printTable(){
	for(Boolean[] k:data){
	    for(int i = 0;i<k.length;i++)System.out.println("-");
	    for(Boolean p:k){
		System.out.println("|"+(p)?"T":"F");
	    }
	    System.out.print("|");
	}
    }
    public void printTableNumbers(){
	int[][]val = new int[data.length][data.width];
	for(int x = 0; x < data.length;x++){
	    for(int j = 0; j < data[x].length;j++){
		if (data[x][j]){
		    val[x][j] +=1;
		    if(x != data.length - 1){
			val[x+1][j]++;
			if(j != data[x].length - 1) val[x+1][j=1]++;
		    }
		}
	    }
	}
    }
}
