public class Week2_3 {

	public static void main(String[] args) {
		
		int sum = 0;

		System.out.println("random() ���� �߻��� �� : ");
		for (int i = 0; i <100; i++) {
			double randNum = Math.random(); //0 <= randNum < 1
			int rn = (int)(randNum * 100);
			sum += rn;
			
			System.out.print(rn + "\t");
			
			if ((i+1) % 10 == 0)
				System.out.println();
		}
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double)sum/100);
			
	}

}
