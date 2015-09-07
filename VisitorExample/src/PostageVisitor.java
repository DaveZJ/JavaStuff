public class PostageVisitor implements Visitor {
  private double totalPostageForCart;
  //collect data about the book
  public void visit(Book book) {
    //assume we have a calculation here related to weight and price
    //free postage for a book over 10 
    if(book.getPrice() < 10.0) {
      totalPostageForCart += book.getWeight() * 2;
    }
  }
  //add other visitors here
  public void visit(CD cd) {
	//assume we have a calculation here related to weight and price
	    //free postage for a CD over 4 
	    if(cd.getPrice() < 4.0) {
	      totalPostageForCart += cd.getWeight();
	    }
  }
  
  //return the internal state
  public double getTotalPostage() {
    return totalPostageForCart;
  }
}