package linearSearchAlgorithm;

public class MaxWealth {

	public static void main(String[] args) {

		int[][] accounts = {{1,2,5},{3,2,1}};
		System.out.println(maximumWealth(accounts));
	}

	static int maximumWealth (int[][] accounts) {
		// person = rol
		// account = col
		int ans = Integer.MIN_VALUE;
		for (int[] ints: accounts) {
			// when you start a new col, take a new sum for that row
			int sum = 0;
			for (int anInt : ints) {
				sum += anInt;
			}
			// now we have sum of accounts of person
			// check with overall ans
			if (sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}
}
