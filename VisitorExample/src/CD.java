//concrete element (CD)
public class CD implements Visitable{
  private double price;
  private double weight;
  //constructor
  public CD(double item_price, double item_weight){
	  price = item_price;
	  weight = item_weight;
  }
  
  //accept the visitor
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
  public double getPrice() {
    return price;
  }
  public double getWeight() {
    return weight;
  }
}