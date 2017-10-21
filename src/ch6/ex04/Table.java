package ch6.ex04;

import java.util.ArrayList;
import java.util.HashMap;

public class Table<K,V> {
	private ArrayList<HashMap<K,V>> list;
	private HashMap<K,V> entry;
	private HashMap<K,V> map = null;
	
	public class Entry{
		private HashMap<String, String> entry1;
		private HashMap<String, Integer> entry2;
		private HashMap<String, String> entry3;
		
		public Entry() {
			entry1 = new HashMap<String, String>();
			entry2 = new HashMap<String, Integer>();
			entry3 = new HashMap<String, String>();
		}
		
		try {
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
	public Table() {
		list = new ArrayList<HashMap<K,V>>();
	}
	
	// Entry<K,V> 요소를 배열리스트에 추가
	public void add(HashMap<K, V> entry) {
	    list.add(entry);		
	}
	
	// 키에 대응하는 값 조회
	public V getKey(String key) {				
		// 배열리스트 사이즈만큼 반복문 동작, 배열리스트의 각 요소 HashMap을 꺼내서 파라메터 Key값으로 Value값을 조회한다.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.get(key) != null) {
				break;
			}
		}
		
		return map.get(key);
	}
	
	// 키에 대응하는 값 삭제
	public void remove(String key) {		
		// 배열리스트 사이즈만큼 반복문 동작, 배열리스트의 각 요소 HashMap을 꺼내서 파라메터 Key값으로 같은 Key값을 찾은 다음 해당 요소를 삭제한다.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.containsKey(key)) {
				map.remove(key);
			}
		}
	}
	
	// 배열리스트의 전체 요소를 조회한다.
	public ArrayList<HashMap<K,V>> getList() {	
		return list;
	}
}



