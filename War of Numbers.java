public class Challenge {
  
	public static int warOfNumbers(int [] numbers) {
		
		int even = 0;
		int odd = 0;
	
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {
				 even += numbers[i];
			} else {
				 odd += numbers[i];
			}
		}
		
		return even > odd ? even - odd : odd - even;
	}
}
