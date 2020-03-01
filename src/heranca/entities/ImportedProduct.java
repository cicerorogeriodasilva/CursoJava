package heranca.entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price) {
		super(name, price);
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice () {
		
		return getPrice() + getCustomsFee();
		
	}

	@Override
	public String priceTag() {
		
		return String.format("%s $ %.2f ", getName(),totalPrice()) + this.toString();
	}

	@Override
	public String toString() {
		
		return String.format("(Customs fee: $ %.2f)", customsFee);
	}
	
}
