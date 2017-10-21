package ex04;

public class Circle extends Shape {
	private double radius;	
	  
	public Circle(Point center, double radius){
		this.radius = radius;
		super.setPoint(center);
	}
	
	//원의 넓이
	public double getCircleArea(){
		return this.radius * this.radius * 3.14;
	}
	
	//결과값
	@Override
	public Point getCenter(){		
		return super.getPoint();
	}
}
