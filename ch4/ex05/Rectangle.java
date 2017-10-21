package ex05;

public class Rectangle extends Shape {
	
	public Rectangle(Point topLeft, double width, double height){		
		super.setPoint(topLeft);
		super.moveBy(width, height);
	}
	
	@Override
	public Point getCenter(){
		return getPoint();
	}
}
