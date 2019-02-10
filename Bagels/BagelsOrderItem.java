public class BagelsOrderItem implements OrderItem{
    private double price;
    private int quantity;
    public BagelsOrderItem(double price, int quantity){
	this.price = price;
	this.quantity = quantity;
    }
    @Override
    public int getQuantity(){
	return quantity;
    }
    @Override
    public double getPrice(){
	return price;
    }
    @Override
    public double getCost(){
	return price * quantity;
    }
}
