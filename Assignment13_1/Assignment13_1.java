import java.io.*;

public class Assignment13_1 {

	public static void main(String[] args) {

		try {
			String filename1 = "input.txt";
			String filename2 = "out.txt";
			FileReader fr = new FileReader(filename1);
			FileWriter fw = new FileWriter(filename2);
			
			int ch = 0;
			
			while((ch = fr.read()) != -1) {
				if (ch >= 65 && ch <= 90)
					fw.write(ch);
				else {
					ch -= 32;
					fw.write(ch);
				}
			}
			System.out.println();
			fr.close();
			fw.close();
			//사실 close 함수가 내부적으로 flush함수를 호출한다고 한다.
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
