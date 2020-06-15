import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment13_2 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		try {
			int ctn;
			FileWriter fw = new FileWriter("result.txt");
			
			do {			
				System.out.print("����� ��ȣ�� �Է��ϼ���>>");
				String num = sc.next();
				System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���>>");
				String phone = sc.next();
				System.out.print("����� �̸��� �Է��ϼ���>>");
				String name = sc.next();
				System.out.print("����� �̸����� �Է��ϼ���>>");
				String mail = sc.next();
				fw.write(num+","+phone+","+name+","+mail+"\n");
				System.out.print("�Է��� �������� 0, ��� �Է��Ϸ��� 1�� �Է��ϼ��� >>");
				ctn = sc.nextInt();
			}while(ctn == 1);
			
			System.out.println();
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("�˻��� ����� ��ȣ�� �Է��ϼ���>>");
		String num = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader("result.txt"))) {
			String line;
			
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				while(st.hasMoreTokens()) {
					if (num.equals(st.nextToken()))
						System.out.println("����� ��ȣ"+num+"�� ��ȭ��ȣ�� "+st.nextToken());
				}
			}
		}
		
		sc.close();
	}

}
