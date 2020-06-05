import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Week12_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> data = new HashMap<String, String>();
				
		data.put("java",  "자바");
		data.put("school", "학교");
		data.put("map", "지도");
		
		for(Map.Entry<String, String> s : data.entrySet()) {
			
			String key = s.getKey();
			String value = s.getValue();
			
			System.out.println("(" + key + ", "+value+")");
		}
		
		do {
			System.out.print("찾고싶은 단어를 입력하세요 >> ");
			String key = sc.next();
			
			if (key.equals("quit")) break;
			else
				System.out.println("단어의 의미는 "+data.get(key));
			
		}while(true);
		
		sc.close();
	}

}
