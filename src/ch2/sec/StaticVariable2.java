package ch2.sec;

public class StaticVariable2  {
    //static 변수 선언:같은 메모리 주소를 참조한다.
	static int count = 0;
    
    //instance
    StaticVariable2() {
        this.count++;
        System.out.println(this.count);
    }

    public static void main(String[] args) {
    	StaticVariable2 c1 = new StaticVariable2();
    	StaticVariable2 c2 = new StaticVariable2();
    }
}