package ex05;

public abstract class Shape implements Cloneable{	
	private double dx;
	private double dy;	 
	private Point p = null;
	
	public Shape(){
		this.dx = 0;
		this.dy = 0;
		this.p = new Point(dx, dy);
	}
	
	public Shape(double x, double y){
		this.dx = x;
		this.dy = y; 
		this.p = new Point(dx, dy);
	}
	
	public void moveBy(double dx, double dy){
		double paramX = this.dx+dx;
		double paramY = this.dx+dx;
		this.p = new Point(paramX, paramY);		
	}	
	
	public Point getPoint() {
		return p;
	}
	
	public void setPoint(Point point) {
		this.p = point;
	}
	 
	public abstract Point getCenter();
	
	@Override
	public Shape clone() throws CloneNotSupportedException {
		return (Shape) super.clone();
	}
}
