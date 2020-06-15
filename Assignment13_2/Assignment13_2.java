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
				System.out.print("사용자 번호를 입력하세요>>");
				String num = sc.next();
				System.out.print("사용자 전화번호를 입력하세요>>");
				String phone = sc.next();
				System.out.print("사용자 이름을 입력하세요>>");
				String name = sc.next();
				System.out.print("사용자 이메일을 입력하세요>>");
				String mail = sc.next();
				fw.write(num+","+phone+","+name+","+mail+"\n");
				System.out.print("입력이 끝났으면 0, 계속 입력하려면 1을 입력하세요 >>");
				ctn = sc.nextInt();
			}while(ctn == 1);
			
			System.out.println();
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("검색할 사용자 번호를 입력하세요>>");
		String num = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader("result.txt"))) {
			String line;
			
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				while(st.hasMoreTokens()) {
					if (num.equals(st.nextToken()))
						System.out.println("사용자 번호"+num+"의 전화번호는 "+st.nextToken());
				}
			}
		}
		
		sc.close();
	}

}
