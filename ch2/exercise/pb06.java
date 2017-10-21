package ch2.exercise;

import java.util.HashMap;
/*
 *  �������� 5���� �ݺ��ϵ� �̹����� translate�� scale�� �����ڷ� �����.
 */
public class pb06 {
	public static void main(String[] args) {

		HashMap rslPointer = null;
		Point p = new Point(3, 4);

		System.out.println("1. �ʱ� ��ǥ: (" + p.getX() + "," + p.getY() + ")");

		p.translate(1, 3);
		System.out.println("2. translate() ���� ��ǥ: (" + p.getX() + "," + p.getY() + ")");

		rslPointer = p.scale(0.5);
		System.out.println("3. scale() ���� ��ǥ: (" + rslPointer.get("x") + "," + rslPointer.get("y") + ")");

	}

	private static class Point {
		private double x;
		private double y;
		HashMap scaleList = new HashMap<>();

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

		void translate(int paramX, int paramY) {
			this.x = x + paramX; // System.out.println("x: " + x);
			this.y = y + paramY; // System.out.println("x: " + y);
		}

		HashMap scale(double rate) {
			double resultX = x * rate;
			double resultY = y * rate;

			scaleList.put("x", resultX);
			scaleList.put("y", resultY);

			return scaleList;
		}
	}
}
