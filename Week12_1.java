import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Week12_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> data = new HashMap<String, String>();
				
		data.put("java",  "�ڹ�");
		data.put("school", "�б�");
		data.put("map", "����");
		
		for(Map.Entry<String, String> s : data.entrySet()) {
			
			String key = s.getKey();
			String value = s.getValue();
			
			System.out.println("(" + key + ", "+value+")");
		}
		
		do {
			System.out.print("ã����� �ܾ �Է��ϼ��� >> ");
			String key = sc.next();
			
			if (key.equals("quit")) break;
			else
				System.out.println("�ܾ��� �ǹ̴� "+data.get(key));
			
		}while(true);
		
		sc.close();
	}

}
