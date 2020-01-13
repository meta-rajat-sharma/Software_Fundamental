class Product {
	String name;
	int price;
	int quantity;
	
	public Product(){
		price=quantity=0;
		name="";
	}
	public Product(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name,int price) {
		this.name = name;
		this.price= price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

