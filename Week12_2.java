import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week12_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> info = new HashMap<String, Integer>();
		int biggest = 0;
		String nation = "";
		
		System.out.println("���� �̸��� �α��� 3�� �Է��ϼ���.(��: Korea 5000)");
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+" �����̸�, �α� >>");
			String name = sc.next();
			int num = sc.nextInt();
			info.put(name, num);
			
			if (biggest < num) {
				biggest = num;
				nation = name;
			}
		}
		
		System.out.println("���� �α��� ���� ����� "+ nation + " "+ biggest +"��");
		
		sc.close();
	}

}
