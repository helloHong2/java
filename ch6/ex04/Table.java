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
			entry1.put("�̸�", "�Ŵ�ȫ");		    
		    entry2.put("����", 26);
		    entry3.put("����", "������"); 
		    
		    Table table = new Table();
		    
		    // Entry<K,V> ��Ҹ� �迭����Ʈ�� �߰��ϱ�
		    table.add(entry1);
		    table.add(entry2);
		    table.add(entry3);
		    
		    System.out.println("1.�迭 ����Ʈ ��ü ��� ��ȸ \n-> " + table.getList() + "\n");		    
		    System.out.println("2.Ű�� �����ϴ� �� ������ \n-> " + table.getKey("����") + "\n");
		    
		    table.remove("����");
		    System.out.println("3.Ű�� �����ϴ� �� �����ϱ� \n-> " + table.getList());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Table() {
		list = new ArrayList<HashMap<K,V>>();
	}
	
	// Entry<K,V> ��Ҹ� �迭����Ʈ�� �߰�
	public void add(HashMap<K, V> entry) {
	    list.add(entry);		
	}
	
	// Ű�� �����ϴ� �� ��ȸ
	public V getKey(String key) {				
		// �迭����Ʈ �����ŭ �ݺ��� ����, �迭����Ʈ�� �� ��� HashMap�� ������ �Ķ���� Key������ Value���� ��ȸ�Ѵ�.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.get(key) != null) {
				break;
			}
		}
		
		return map.get(key);
	}
	
	// Ű�� �����ϴ� �� ����
	public void remove(String key) {		
		// �迭����Ʈ �����ŭ �ݺ��� ����, �迭����Ʈ�� �� ��� HashMap�� ������ �Ķ���� Key������ ���� Key���� ã�� ���� �ش� ��Ҹ� �����Ѵ�.
		for(int i=0; i < list.size(); i++) {
			map = (HashMap<K,V>) list.get(i);
			
			if(map.containsKey(key)) {
				map.remove(key);
			}
		}
	}
	
	// �迭����Ʈ�� ��ü ��Ҹ� ��ȸ�Ѵ�.
	public ArrayList<HashMap<K,V>> getList() {	
		return list;
	}
}



