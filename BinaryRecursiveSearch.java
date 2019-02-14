import java.util.*;

public class BinaryRecursiveSearch implements Practice03Search {
	
	public String searchName() {
		return "binary recursive";
	}

	public int search(int[] arr, int target) {

		return binsearch(arr, target, 0, arr.length - 1);
		
	}	

	public int binsearch(int[] arr, int target, int start, int end) {

		int mid = (start + end) / 2;

		if (end < start) {
			return -1;
		}
		 	
		if (target == arr[mid]) {
			return mid;
		}
		else if (target > arr[mid]) {
			return binsearch(arr, target, start, mid-1);
		}
		else {
			return binsearch(arr, target, mid+1, end);
		}
	}	
}