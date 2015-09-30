import java.lang.Math;

public abstract class Triangle extends GeometricObject {
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public Triangle() {	
	}
	
	public Triangle(double side1,double side2,double side3){
	
	}
	//Getter methods to each of the sides
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;	
	}
	//method that adds up the sides of the triangle 
	//and returns the perimeter
	public double getPerimeter(){
		double perimeter = side1 +side2 +side3;
		return perimeter;
	}
	//method gets the area using herons method
	public double getArea() {
		double s = getPerimeter()/2;
		double m = s*(s-side1)*(s-side2)*(s-side3);
		double area = Math.pow(m,.5);
		return area;
	}
	//method returns a string of what the area and perimeter are.
	//public String toString() {
		//return "the perimeter is %d and the area is %d"+getPerimeter()+ getArea();
	//}
	
}