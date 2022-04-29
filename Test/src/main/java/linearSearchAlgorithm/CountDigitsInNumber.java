package linearSearchAlgorithm;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		System.out.println(digits(0));
	}
	
	// count number of digits in a number
	static int digits (int num) {
		
		 if (num < 0) {
			 num = num * -1;
		 }
		 if (num == 0) {
			 return 1;
		 }
		
		int count = 0;
		while (num > 0) {
			count++;
			num= num / 10; // num /= 10
		}
		return count;
	}
}
