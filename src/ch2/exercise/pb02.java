package ch2.exercise;

import java.util.Random;
import java.util.Scanner;

public class pb02 {
	/*
	 * Q: Scanner Ŭ������ nextint �޼��带 �����غ���. �� �޼���� �������ΰ� �������ΰ�? �� ������ �����ΰ�?
	 * Random Ŭ������ nextint �޼���� ���?
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // ���� �Է��� ���ڷ� Scanner ����
		int message;

		System.out.println("������ �Է��ϼ��� : ");
		/*
		 * A: System.in���� �Է¹��� ���� nextInt.setRadix()�� ���ؼ� scanŬ���� ��ü�� set�Ѵ�. ->
		 * ������ ����ڰ� �Է��� ���� ��ȯ�Ѵ�. -> ������
		 */

		message = scan.nextInt();
		System.out.println("����: " + message);

		/*
		 * A: Random.nextInt()�� �����Ͽ� ������ ������ get�Ͽ� rndŬ���� ��ü�� ��ȯ�Ѵ�. -> ������
		 * nextInt()�� �Ķ���Ͱ� ������ int���� ��ȿ�������� ���� ����
		 */

		Random rnd = new Random();

		int i = rnd.nextInt();
		System.out.println(i);
	}
}
