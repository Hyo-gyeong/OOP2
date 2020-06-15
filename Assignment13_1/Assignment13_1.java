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
			//��� close �Լ��� ���������� flush�Լ��� ȣ���Ѵٰ� �Ѵ�.
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
