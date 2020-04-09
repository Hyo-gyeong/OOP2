public class Week2_3 {

	public static void main(String[] args) {
		
		int sum = 0;

		System.out.println("random() 으로 발생한 수 : ");
		for (int i = 0; i <100; i++) {
			double randNum = Math.random(); //0 <= randNum < 1
			int rn = (int)(randNum * 100);
			sum += rn;
			
			System.out.print(rn + "\t");
			
			if ((i+1) % 10 == 0)
				System.out.println();
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/100);
			
	}

}
