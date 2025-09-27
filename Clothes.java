package onlineStore;

public class Clothes extends Product {
	
	double size;
	public Clothes(double size,String name,double price) {
		this.size = size;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Clothes [size=" + size + ", name=" + name + ", price=" + price + "]";
	}
}
