package ch6.ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class MainMethod {
	
	public static void main(String[] args) {
		HashMap<String, String> entry1 = new HashMap<String, String>();
		HashMap<String, Integer> entry2 = new HashMap<String, Integer>();
		HashMap<String, String> entry3 = new HashMap<String, String>();
		
		try{
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
}