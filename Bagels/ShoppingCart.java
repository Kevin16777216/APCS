import java.util.ArrayList;
public class ShoppingCart extends ArrayList<OrderItem>{
    public static void main(String[] args){
	ShoppingCart cart = new ShoppingCart();
	cart.add(new BagelsOrderItem(0.25, 3));
	cart.add(new BakersDozen(0.35));
	System.out.printf("Total due:  $%.2f", cart.totalDue());
    }
    public double totalDue(){
	    double sum = 0.0;
	    for(OrderItem i: this){
		sum += i.getCost();
	    }
	    return sum;
    }
    }
