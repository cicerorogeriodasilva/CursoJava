package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double area() {
		
		return width * heigth;
		
	}
	public double perimeter() {
		
		return 2.0 * width + 2.0 * heigth;
		
	}
    public double diagonal() {
    	
    	return Math.sqrt(Math.pow(width, 2.0) + Math.pow(heigth, 2.0));
    }
}
