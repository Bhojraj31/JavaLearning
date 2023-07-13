package Assignment_Array;

public class SearchingArray {

	public static int binarySearch(int[] arr, int target) {
		int left = arr[0];
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 12, 16, 23, 38, 56, 72, 91 };
		int key = 16;
		int result = binarySearch(arr, key);
		if (result == 0) {
			System.out.println("Element not found in the array.");
		} else {
			System.out.println("Element found at index " + result + ".");
		}
	}
}
