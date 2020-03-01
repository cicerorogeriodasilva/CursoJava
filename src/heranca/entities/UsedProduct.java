package heranca.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {

	}
	
	public UsedProduct(String name, Double price) {
		super(name, price);
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		
		return this.toString();
	}

	@Override
	public String toString() {
		//
		return String.format("%s (used) $ %.2f (Manufacture date: "
			   + "%s)", this.getName(), this.getPrice(),
			   sdf.format(manufactureDate));
	}	
}
