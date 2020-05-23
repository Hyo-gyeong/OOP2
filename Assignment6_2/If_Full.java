
public class If_Full {
	
	int full_check(int[] seats){
		for (int i = 0; i < 5; i++)
			if (seats[i] == 0)
				return 0;
		return 1;
	}
}
