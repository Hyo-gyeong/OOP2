public class Week2_3 {

	public static void main(String[] args) {
		
		int sum = 0;

		System.out.println("random() À¸·Î ¹ß»ýÇÑ ¼ö : ");
		for (int i = 0; i <100; i++) {
			double randNum = Math.random(); //0 <= randNum < 1, 0을 포함함!
			int rn = (int)(randNum * 100) + 1;//1을 더해줘야 최소수가 1이됨
			sum += rn;
			
			System.out.print(rn + "\t");
			
			if ((i+1) % 10 == 0)
				System.out.println();
		}
		
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + (double)sum/100);
			
	}

}
