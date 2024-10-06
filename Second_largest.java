package Two_sum;

public class Second_largest {

	public static int secondLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				second = max;
				max = arr[i];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > second && arr[i] != max) {
				second = arr[i];
			}
		}
		return second;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arr = { 8, 4, 6, 1, 3, 9 };
		System.out.println(Second_largest.secondLargest(arr));
	}
}
