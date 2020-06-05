import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week12_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> info = new HashMap<String, Integer>();
		int biggest = 0;
		String nation = "";
		
		System.out.println("나라 이름고 인구를 3개 입력하세요.(예: Korea 5000)");
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+" 나라이름, 인구 >>");
			String name = sc.next();
			int num = sc.nextInt();
			info.put(name, num);
			
			if (biggest < num) {
				biggest = num;
				nation = name;
			}
		}
		
		System.out.println("가장 인구가 많은 나라는 "+ nation + " "+ biggest +"명");
		
		sc.close();
	}

}
