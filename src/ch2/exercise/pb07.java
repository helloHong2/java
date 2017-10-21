package ch2.exercise;

import java.util.HashMap;
/**
 * <code>Pointer</code>
 * @author Shin-DaeHong
 * @version 1.0
 *
 */
public class pb07 {
	public static void main(String[] args) {

		Point p = new Point(3, 4);

		System.out.println("1. �ʱ� ��ǥ: (" + p.getX() + "," + p.getY() + ")");

		p.translate(1, 3);
		System.out.println("2. translate() ���� ��ǥ: (" + p.getX() + "," + p.getY() + ")");

		p.scale(0.5);
		System.out.println("3. scale() ���� ��ǥ: (" + p.getX() + "," + p.getY() + ")");
	}

	private static class Point {
		private double x;
		private double y;

		Point() {
			this.x = 0;
			this.y = 0;
		}

		Point(int paramX, int paramY) {
			this.x = paramX;
			this.y = paramY;
		}

		double getX() {
			return this.x;
		}

		double getY() {
			return this.y;
		}

		void translate(double paramX, double paramY) {
			this.x = x + paramX; 
			this.y = y + paramY; 
		}

		void scale(double rate) {			
			this.x = x * rate;
			this.y = y * rate;
		}
	}
}
