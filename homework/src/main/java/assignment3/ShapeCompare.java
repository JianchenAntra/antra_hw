package assignment3;

public class ShapeCompare{
interface Shape {
	public double area();
}

class Circle implements Shape, Comparable<Circle> {
	double radius;
	double pi = 3.1415926;
	Circle(double radius){
		this.radius = radius;
		
	}
	
	@Override
	public double area() {
		return radius * radius * pi;
	}
	@Override
	public int compareTo(Circle c) {
		if(this.area() == c.area()) {
			return 0;
		}else if(this.area() > c.area()) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

class Rectangle implements Shape, Comparable<Rectangle> {
	double height;
	double width;
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double area() {
		return height*width;
	}
	
	@Override
    public int compareTo(Rectangle r) {
        if(this.area() == r.area()){
            return 0;
        }
        if(this.area() < r.area()){
            return -1;
        }else{
            return 1;
        }
    }
}
	
	class Square implements Shape, Comparable<Square> {
		double length;
		Square(double length){
			this.length = length;
		}
		
		@Override
		public double area() {
			return length*length;
		}
		
		@Override
	    public int compareTo(Square s) {
	        if(this.area() == s.area()){
	            return 0;
	        }
	        if(this.area() < s.area()){
	            return -1;
	        }else{
	            return 1;
	        }
	    }
	}
	
}
