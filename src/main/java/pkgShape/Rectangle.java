package pkgShape;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  


public class Rectangle extends Shape{

	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int iWidth, int iLength) throws IllegalArgumentException {
	
		super();
		
		if(iWidth <= 0) {
			throw new IllegalArgumentException("iWidth must be positive");
		}
		if(iLength <= 0) {
			throw new IllegalArgumentException("iLength must be positive");
		}
		

		this.iWidth = iWidth;
		this.iLength = iLength;
		
		
	}
	
	public int getiWidth() {
		return this.iWidth;
	}
	
	public void setiWidth(int a) throws IllegalArgumentException{
		if(a <= 0) {
		throw new IllegalArgumentException("iWidth must be positive");
		}
		
		this.iWidth = a;
	}
	
	public int getiLength() {
		return this.iLength;
	}
	
	public void setiLength(int a) throws IllegalArgumentException {
		if(a <= 0) {
			
		throw new IllegalArgumentException("iLength must be positive");
		}
		
		this.iLength = a;
	}
	
	@Override
	public double area() {
		return this.iWidth * this.iLength;
	}
	
	@Override
	public double perimiter() {
		return (this.iLength * 2) + (this.iWidth * 2);
	}
	
	public int compareTo(Rectangle a) {
		
		if(this.area() < a.area()) {
			return -1;
		}
		if(this.area() > a.area()) {
			return 1;
		}
		else {
			return 0;
		}
		
		}
		
}
	


