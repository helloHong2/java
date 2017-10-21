package ex05;

public class Line extends Shape {

	public Line(Point from, Point to){
		// [x좌표] from.x - to.x, [y좌표] from.y - to.y 
		super.setPoint( new Point( to.getX() - from.getX(), to.getY() - from.getY() ) );
	}
	
	@Override
	public Point getCenter(){							
		return super.getPoint();
	}
}
