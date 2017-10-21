package ch2.exercise;

import java.util.Random;
import java.util.Scanner;

public class pb02 {
	/*
	 * Q: Scanner 클래스의 nextint 메서드를 생각해보자. 이 메서드는 접근자인가 변경자인가? 그 이유는 무엇인가?
	 * Random 클래스의 nextint 메서드는 어떤가?
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성
		int message;

		System.out.println("정수를 입력하세요 : ");
		/*
		 * A: System.in으로 입력받은 값을 nextInt.setRadix()를 통해서 scan클래스 객체에 set한다. ->
		 * 변경자 사용자가 입력한 값을 반환한다. -> 접근자
		 */

		message = scan.nextInt();
		System.out.println("정수: " + message);

		/*
		 * A: Random.nextInt()에 접근하여 생성된 난수를 get하여 rnd클래스 객체에 반환한다. -> 접근자
		 * nextInt()의 파라메터가 없으면 int형의 유효범위에서 난수 생성
		 */

		Random rnd = new Random();

		int i = rnd.nextInt();
		System.out.println(i);
	}
}
