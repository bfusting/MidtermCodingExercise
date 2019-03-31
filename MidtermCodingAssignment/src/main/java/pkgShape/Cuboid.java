package pkgShape;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	
	public class SortByVolume implements Comparator<Cuboid>{

		protected SortByVolume() {

		}
			
		
		public int compare(Cuboid a, Cuboid b)  {
			if(a.volume() < b.volume()) {
				return -1;
			}
			if(b.volume() < a.volume()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
	
	}
	
	
	public class SortByArea implements Comparator<Cuboid>{
		
		protected SortByArea() {
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			if(a.area() < b.area()) {
				return -1;
			}
			if(b.area() < a.area()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
	}
	
SortByArea sortArea = new SortByArea();	
SortByVolume sortVolume = new SortByVolume();
	
	
	
	
	public Cuboid(int width, int length, int depth) throws IllegalArgumentException{
		super(width, length);
		
		if(iDepth <= 0) {
			throw new IllegalArgumentException("iDepth must be positive");
		}
		
		this.iDepth = depth;
	}
	
	public int getiDepth() {
		return this.iDepth;
	}
	
	public void setiDepth(int a) throws IllegalArgumentException {
		if(a <= 0) {
			throw new IllegalArgumentException("iDepth must be positive");
		}
		
		this.iDepth = a;
	}
	
	public double volume() {
		
		return this.getiLength() * this.getiWidth() * this.iDepth;
		
	}
	
	
	@Override
	public double area() {
		return (this.getiWidth() * this.getiLength() * 2) + (this.getiLength() * this.iDepth * 2) + (this.getiWidth() * this.iDepth * 2);
	}
	

	public int compareTo(Cuboid a) {
		
		return sortArea.compare(this, a);
		
		
	}
	
	@Override
	public double perimiter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Cuboid cannot call perimiter");
	}
}
