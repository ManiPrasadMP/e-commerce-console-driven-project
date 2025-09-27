package onlineStore;

public class Electronics extends Product{

	String type;
	
	public Electronics(String type,String name,double price) {
		
		this.type = type;
		this.name = name;
		this.price = price;
	}
	

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	


	@Override
	public String toString() {
		return "Electronics [Type=" + type + ", name=" + name + ", price=" + price + "]";
	}
}
