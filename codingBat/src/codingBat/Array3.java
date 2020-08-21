package codingBat;

public class Array3 {
	public int maxSpan(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int longest = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					longest = Math.max(longest, (j - i + 1));
				}
			}
		}
		return longest;
	}

	public boolean canBalance(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int sumLeft = 0;
			int sumRight = 0;
			for (int j = 0; j < nums.length; j++) {
				if (j <= i) {
					sumLeft = sumLeft + nums[j];
				} else {
					sumRight = sumRight + nums[j];
				}
			}
			if (sumLeft == sumRight) {
				return true;
			}
		}
		return false;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		int outerInd = 0;
		for (int i = 0; i < inner.length; i++) {
			while (outer[outerInd] < inner[i]) {
				outerInd++;
				if (outerInd == outer.length) {
					return false;
				}
			}
			if (outer[outerInd] != inner[i]) {
				return false;
			}
		}
		return true;
	}

	public int[] squareUp(int n) {
		int[] ret = new int[n * n];
		int ind = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (j > i) {
					ret[ind] = 0;
					ind++;
				} else {
					ret[ind] = j;
					ind++;
				}
			}
		}
		return ret;
	}

	public int[] seriesUp(int n) {
		int size = n * (n + 1) / 2;
		int[] ret = new int[size];
		int ind = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				ret[ind] = j;
				ind++;
			}
		}
		return ret;
	}

	public int countClumps(int[] nums) {
		int clumps = 0;
		for (int i = 0; i < nums.length; i++) {
			int curr = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					curr++;
					continue;
				}
				break;
			}
			if (curr >= 2) {
				clumps++;
				i = i + curr - 1;
			}
		}
		return clumps;
	}

	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == 4) {
						nums[j] = -1;
						nums = swap(nums, i + 1, j);
						break;
					}
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == -1) {
				nums[i] = 4;
			}
		}
		return nums;
	}

	public int[] swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
		return nums;
	}

	public int[] fix45(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == 5) {
						nums[j] = -1;
						nums = swap2(nums, i + 1, j);
						break;
					}
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == -1) {
				nums[i] = 5;
			}
		}
		return nums;
	}

	public int[] swap2(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
		return nums;
	}

	public int maxMirror(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int longest = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int[] small = subArray(nums, i, j);
				small = rev(small);
				if (checkMax(small, nums)) {
					longest = Math.max(longest, small.length);
				}
			}
		}
		return longest;
	}

	public int[] subArray(int[] A, int beg, int end) {
		int[] ret = new int[end - beg + 1];
		int j = 0;
		for (int i = beg; i <= end; i++) {
			ret[j] = A[i];
			j++;
		}
		return ret;
	}

	public int[] rev(int[] a) {
		int[] ret = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			ret[j] = a[i];
			j++;
		}
		return ret;
	}

	public boolean checkMax(int[] small, int[] whole) {
		for (int i = 0; i < whole.length - small.length + 1; i++) {
			for (int j = 0; j < small.length; j++) {
				if (whole[i + j] == small[j]) {
					if (j == small.length - 1) {
						return true;
					}
				} else {
					break;
				}
			}
		}
		return false;
	}

}
