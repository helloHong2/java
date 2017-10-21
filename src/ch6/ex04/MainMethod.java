package ch6.ex04;

import java.util.ArrayList;
import java.util.HashMap;

public class MainMethod {
	
	public static void main(String[] args) {
		HashMap<String, String> entry1 = new HashMap<String, String>();
		HashMap<String, Integer> entry2 = new HashMap<String, Integer>();
		HashMap<String, String> entry3 = new HashMap<String, String>();
		
		try{
			entry1.put("이름", "신대홍");		    
		    entry2.put("나이", 26);
		    entry3.put("직업", "개발자");
		    
		    Table table = new Table();
		    
		    // Entry<K,V> 요소를 배열리스트에 추가하기
		    table.add(entry1);
		    table.add(entry2);
		    table.add(entry3);
		    
		    System.out.println("1.배열 리스트 전체 요소 조회 \n-> " + table.getList() + "\n");		    
		    System.out.println("2.키에 대응하는 값 얻어오기 \n-> " + table.getKey("직업") + "\n");
		    
		    table.remove("나이");
		    System.out.println("3.키에 대응하는 값 삭제하기 \n-> " + table.getList());
		    
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}